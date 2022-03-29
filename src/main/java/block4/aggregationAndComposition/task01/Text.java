package block4.aggregationAndComposition.task01;

public class Text {
    private String title;
    private String content;

    public Text(Word title, Sentence sentence) {
        this.title = title.getWord();
        this.content = sentence.getSentence();
    }

    public Text(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Text(String title) {
        this.title = title;
        this.content = "";
    }

    public Text() {
        this.title = "Empty";
        this.content = "";
    }

    public void printTitle() {
        System.out.println("Title: " + this.title);
    }

    public void printText() {
        printTitle();
        System.out.println(this.content);
    }

    public void addText(Sentence sentence) {
        this.content += sentence.getSentence();
    }

    public void addText(String sentence) {
        this.content+=" ";
        this.content += sentence;
    }
}
