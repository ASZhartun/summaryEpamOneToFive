/*
  1. Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
  операции:
  a) отсортировать абзацы по количеству предложений; done
  b) в каждом предложении отсортировать слова по длине; done
  c) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства –
  по алфавиту. done
 */
package block3.textParser.textParser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    private final static String REGEX_PARAGRAPH = "^.*$";
    private final static String REGEX_SENTENCES = ".+?[\\.\\?\\!]\\”?";
    private final static String REGEX_WORDS = "[a-zA-z]+";
    private String source;
    private ArrayList<String> paragraphs;
    private ArrayList<String> sentences;

    public TextParser(String source) {
        this.source = source;
        this.paragraphs = new ArrayList<>();
        parseParagraphs();
        this.sentences = new ArrayList<>();
        parseSentences();
    }

    public TextParser() {

    }

    /**
     * Print title and return source content of text.
     *
     * @return String text of source.
     */
    public String getSource() {
        System.out.println();
        System.out.println("--------------------------Source text--------------------------");
        System.out.println();
        return source;
    }

    /**
     * Print title and return ArrayList<String> with paragraphs from source text.
     *
     * @return ArrayList<String> which elements are paragraphs.
     */
    public ArrayList<String> getParagraphs() {
        System.out.println();
        System.out.println("--------------------------Paragraphs--------------------------");
        System.out.println();
        return paragraphs;
    }

    /**
     * Print title and return ArrayList<String> with sentences from source text.
     *
     * @return ArrayList<String> which elements are sentences.
     */
    public ArrayList<String> getSentences() {
        System.out.println();
        System.out.println("--------------------------Sentences--------------------------");
        System.out.println();
        return sentences;
    }

    /**
     * Sorts an array in ascending order by the number of sentences in a paragraph.
     * Source paragraphs are modified.
     */
    public void AscendingSortParagraphsByQuantitySentences() {
        this.paragraphs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return getSentencesQuantity(o1) - getSentencesQuantity(o2);
            }
        });
    }

    /**
     * Sorts an array in descending order by the number of sentences in a paragraph.
     * Source paragraphs are modified.
     */
    public void DescendingSortParagraphsByQuantitySentences() {
        this.paragraphs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return getSentencesQuantity(o2) - getSentencesQuantity(o1);
            }
        });
    }

    /**
     * Sorts words in each sentence in descending order by the length of word.
     *
     * @return ArrayList<String> - array with sentences where words are sorted by length.
     */
    public ArrayList<String> sortWordsOfEachSentenceByLength() {
        final ArrayList<String> sortSentences = new ArrayList<>();
        for (int i = 0; i < this.sentences.size(); i++) {
            ArrayList<String> temp = getWordsFromSentences(this.sentences.get(i));
            temp.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });
            sortSentences.add(convertArrayListToString(temp));
        }
        return sortSentences;
    }

    /**
     * Sorts words in each sentence in descending order by count of presence specific symbol in word.
     *
     * @param symbol  specific symbol which presence count for sorting of words.
     * @return ArrayList<String> - array with sentences where words are sorted by count of specific symbol and
     * alphabetical order if and only if counts of words are equal.
     */
    public ArrayList<String> sortWordsBySpecificSymbolOccurrence(char symbol) {
        final char s = Character.toLowerCase(symbol);
        final ArrayList<String> sortSentences = new ArrayList<>();
        for (int i = 0; i < this.sentences.size(); i++) {
            ArrayList<String> temp = getWordsFromSentences(this.sentences.get(i));
            temp.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    final int delta = getOccurrenceLetterAt(o2, s) - getOccurrenceLetterAt(o1, s);
                    if (delta == 0) {
                        return o2.compareToIgnoreCase(o1);
                    }
                    return delta;
                }
            });
            sortSentences.add(convertArrayListToString(temp));
        }
        return sortSentences;
    }

    /**
     * Parsing words from sentences.
     *
     * @param sentence  sentence that contains words.
     * @return ArrayList<String> - array of words.
     */
    private ArrayList<String> getWordsFromSentences(String sentence) {
        final ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(REGEX_WORDS);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    /**
     * Count occurrence of specific symbol in specific word.
     *
     * @param word    specific word
     * @param symbol  specific symbol which occurrence counts in specific word.
     * @return occurrence - int value of symbol's occurrence
     */
    private int getOccurrenceLetterAt(String word, char symbol) {
        int occurrence = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == symbol) occurrence++;
        }
        return occurrence;
    }

    /**
     * Convert ArrayList to String by StringBuilder's append with appending extra "\space"
     *
     * @param temp  ArrayList
     * @return String - value of StringBuilder which get by convert ArrayList.
     */
    private String convertArrayListToString(ArrayList<String> temp) {
        final StringBuilder sb = new StringBuilder();
        temp.stream().forEach((item) -> {
            sb.append(item);
            sb.append(" ");
        });
        return sb.toString();
    }

    /**
     * Parse paragraphs, get and put sentences to this.sentences.
     */
    private void parseSentences() {
        Pattern pattern = Pattern.compile(REGEX_SENTENCES);
        Matcher matcher;
        for (int i = 0; i < this.paragraphs.size(); i++) {
            matcher = pattern.matcher(this.paragraphs.get(i));
            while (matcher.find()) {
                this.sentences.add(matcher.group());
            }
        }

    }

    /**
     * Count how many sentences is containing in specific paragraph.
     *
     * @param paragraph  specific paragraph
     * @return int value that contains the number of sentences in a paragraph.
     */
    private int getSentencesQuantity(String paragraph) {
        Pattern pattern = Pattern.compile(REGEX_SENTENCES);
        Matcher matcher = pattern.matcher(paragraph);
        int count = matcher.groupCount();
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    /**
     * Parse source text, get and put paragraphs in paragraphs field.
     */
    private void parseParagraphs() {
        Pattern regexParagraphs = Pattern.compile(REGEX_PARAGRAPH, Pattern.MULTILINE);
        Matcher matcher = regexParagraphs.matcher(this.source);
        while (matcher.find()) {
            this.paragraphs.add(matcher.group());
        }
    }
}
