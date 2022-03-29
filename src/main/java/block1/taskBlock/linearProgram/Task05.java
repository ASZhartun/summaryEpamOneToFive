package block1.taskBlock.linearProgram;

import block1.taskBlock.utilities.GetInput;

/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */
public class Task05 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();

        int T = Integer.parseInt(getInput.scan()); // 1 час 51 минута 43 секунды = 1 * 60 * 60 + 51 * 60 + 43 = 6703 секунд
        getInput.close();
        if (T >= 86400) {
            T %= 86400;
        }
        int hours = T / 3600;
        int minutes = T % 3600 / 60;
        int seconds = T - hours * 3600 - minutes * 60;
        StringBuilder stringBuilder = new StringBuilder();
        if (hours < 10) {
            stringBuilder.append(0);
        }
        stringBuilder.append(hours);
        stringBuilder.append("ч ");
        if (minutes < 10) {
            stringBuilder.append(0);
        }
        stringBuilder.append(minutes);
        stringBuilder.append("мин ");
        if (seconds < 10) {
            stringBuilder.append(0);
        }
        stringBuilder.append(seconds);
        stringBuilder.append("с");
        System.out.println(stringBuilder);
    }
}
