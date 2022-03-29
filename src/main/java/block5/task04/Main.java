package block5.task04;

import block5.task04.bank.Bank;
import block5.task04.bank.Treasure;
import block5.task04.dragon.Dragon;

import java.util.ArrayList;

/**
 * Задача 4.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addTreasure(
                new Treasure(5),
                new Treasure(12),
                new Treasure(23),
                new Treasure(43),
                new Treasure(17),
                new Treasure(31),
                new Treasure(2)
        );
        Dragon chermander = new Dragon("Chermander", bank);
        while (chermander!=null) {

            chermander.printMenu();
            switch (chermander.getAnswer()) {
                case 1: {
                    chermander.getBank().getInfo(0);
                    break;
                }
                case 2: {
                    System.out.println(chermander.getBank().getMostValuable());
                    break;
                }
                case 3: {
                    int answer = chermander.getAnswer("How much money you have?");
                    System.out.println("Your set is ready:");
                    ArrayList<Treasure> treasuresCheckedBy = chermander.getBank().getTreasuresCheckedBy(answer);
                    System.out.println(treasuresCheckedBy);
                    System.out.printf("Total value of set is %d", Bank.getSumOfSet(treasuresCheckedBy));
                    break;
                }
                case 4: {
                    chermander.putTreasure();
                    break;
                }
                default:
                    System.out.println("See ya");
                    chermander = null;
            }
        }

    }
}
