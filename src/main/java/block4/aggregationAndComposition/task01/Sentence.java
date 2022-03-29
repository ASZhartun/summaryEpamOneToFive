package block4.aggregationAndComposition.task01;

public class Sentence {
    private String sentence;

    public Sentence(String text) {
        this.sentence = text;
    }

    public Sentence(Word word) {
        this.sentence = word.getWord();
    }

    public Sentence() {
        this.sentence = "";
    }

    public void addContent(Word word) {
        this.sentence += " ";
        this.sentence += word.getWord();
    }

    public void addContent(Sentence sentence) {
        this.sentence += " ";
        this.sentence += sentence.getSentence();
    }

    public void addContent(String text) {
        this.sentence += " ";
        this.sentence += text;
    }

    public String getSentence() {
        return sentence;
    }
}
