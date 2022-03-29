package block5.task04.dragon;

import block5.task04.bank.Bank;
import block5.task04.bank.Treasure;

import java.util.Random;
import java.util.Scanner;

public class Dragon {
    private String name;
    private Bank bank;
    private static Scanner scanner = new Scanner(System.in);

    public Dragon(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public void putTreasure() {
        Random random = new Random();
        Treasure treasure = new Treasure(random.nextInt(65) + 1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bank.addTreasure(treasure);
    }

    public void printMenu() {
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("Hello stranger! What do you want?");
        System.out.println("1 - I want see all treasures");
        System.out.println("2 - I want see most value treasure");
        System.out.println("3 - I want buy treasures");
        System.out.println("4 - I want to wait more treasures");
        System.out.println("anything other - quit");
    }

    public int getAnswer() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return 4;
        }
    }

    public int getAnswer(String question) {
        System.out.println(question);
        return getAnswer();
    }

    public Bank getBank() {
        return bank;
    }

    public static Scanner getScanner() {
        return scanner;
    }


}
