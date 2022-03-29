package block1.taskBlock.cycles;

import block1.taskBlock.utilities.GetInput;

/**
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task07 {
    private StringBuilder line;

    public Task07() {
        this.line = new StringBuilder();
    }

    public static void main(String[] args) {
        Task07 task07 = new Task07();

        GetInput getInput = new GetInput();
        System.out.println("Scheme of input: m -> n");
        int m = Integer.parseInt(getInput.scan());
        int n = Integer.parseInt(getInput.scan());
        getInput.close();

        while (m <= n) {
            task07.printDividers(m);
            m++;
        }
        System.out.println(task07.line);
    }

    public void printDividers(int number) {
        this.line.append("Dividers for ");
        this.line.append(number);
        this.line.append('\n');
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                this.line.append(i);
                this.line.append(" ");
            }
        }
        this.line.append('\n');
    }
}
