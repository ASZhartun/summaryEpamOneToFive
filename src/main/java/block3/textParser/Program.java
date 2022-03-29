package block3.textParser;

import block3.textParser.textParser.TextParser;
import block3.textParser.textReader.TextReader;
import java.util.ArrayList;

/**
 * 1. Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции:
 * a) отсортировать абзацы по количеству предложений;
 * b) в каждом предложении отсортировать слова по длине;
 * c) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства –
 * по алфавиту.
 */

public class Program {
    public static void main(String[] args) {
        final TextReader textReader = new TextReader("src/main/java/block3/textParser/resources/text.txt");
        String text = textReader.getText();

        TextParser textParser = new TextParser(text);
        System.out.println(textParser.getSource());

        ArrayList<String> paragraphs = textParser.getParagraphs();
        for (String item :
                paragraphs) {
            System.out.println();
            System.out.println(item);
        }

        textParser.DescendingSortParagraphsByQuantitySentences();

        paragraphs = textParser.getParagraphs();
        for (String item :
                paragraphs) {
            System.out.println();
            System.out.println(item);
        }

        final ArrayList<String> sentences = textParser.getSentences();
        for (String item :
                sentences) {
            System.out.println(item);
        }

        textParser.sortWordsOfEachSentenceByLength();
        System.out.println();
        System.out.println("--------------------------Sorted sentences by Length of Words--------------------------");
        System.out.println();
        final ArrayList<String> sortSentences = textParser.sortWordsOfEachSentenceByLength();
        for (String item :
                sortSentences) {
            System.out.println(item);
        }

        textParser.sortWordsOfEachSentenceByLength();
        System.out.println();
        System.out.println("------------Sorted Words in Sentences by Occurrence specific symbol------------");
        System.out.println();
        final ArrayList<String> sortSentencesByOccurrence = textParser.sortWordsBySpecificSymbolOccurrence('H');
        for (String item :
                sortSentencesByOccurrence) {
            System.out.println(item);
        }
    }
}
