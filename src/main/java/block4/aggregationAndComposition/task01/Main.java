package block4.aggregationAndComposition.task01;

/**
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Привет,");
        Word word1 = new Word("глупый");
        Word word2 = new Word("Робот.");
        Word word3 = new Word("Сделай");
        Word word4 = new Word("работу");
        Word word5 = new Word("за");
        Word word6 = new Word("меня.");
        Sentence sentence1 = new Sentence(word);
        sentence1.addContent(word1);
        sentence1.addContent(word2);
        sentence1.addContent("\n");
        Sentence sentence2 = new Sentence("У меня есть просьба.");
        Sentence sentence3 = new Sentence(word3);
        sentence3.addContent("эту");
        sentence3.addContent(word4);
        sentence3.addContent(word5);
        sentence3.addContent(word6);
        sentence2.addContent(sentence3);
        Text text = new Text("Просьба");
        text.addText(sentence1);
        text.addText(sentence2);
        text.addText("Спасибо!");
        text.printText();
        System.out.print("Вы прочли рассказ, у которого ");
        text.printTitle();

    }
}
