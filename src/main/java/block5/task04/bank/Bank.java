package block5.task04.bank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Bank {
    private ArrayList<Treasure> bank;

    public Bank() {
        this.bank = new ArrayList<>();
    }

    public void addTreasure(Treasure treasure) {
        if (this.bank.size() < 100) {
            treasure.setId(this.getGlobalId());
            this.bank.add(treasure);
        }
    }

    public void addTreasure(Treasure... treasures) {
        for (Treasure item :
                treasures) {
            if (this.bank.size() < 100) {
                item.setId(this.getGlobalId());
                this.bank.add(item);
            } else break;
        }
    }

    public void getInfo(int minCost) {
        System.out.println("Bank has treasures which cost is more than " + minCost + ':');
        for (Treasure item :
                this.bank) {
            if (item.getCost() >= minCost) System.out.println(item);
        }
    }

    public Treasure getMostValuable() {
        try {
            return this.bank.stream().max(Comparator.comparing(Treasure::getCost)).orElseThrow();
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Treasure> getTreasuresCheckedBy(int givenAmount) {
        ArrayList<Treasure> set = new ArrayList<>();
        Random random = new Random();
        int index = 0;
        while (set.size() == 0) {
            index = random.nextInt(this.bank.size());
            if (this.bank.get(index).getCost() <= givenAmount) set.add(this.bank.get(index));
        }
        int sumOfSet = getSumOfSet(set);
        if (sumOfSet != givenAmount) {
            for (int i = 0; i < this.bank.size(); i++) {
                if (i != index) {
                    if (sumOfSet + this.bank.get(i).getCost() <= givenAmount) {
                        set.add(this.bank.get(i));
                        sumOfSet += this.bank.get(i).getCost();
                    }
                    if (sumOfSet == givenAmount) return set;
                }
            }
        }
        return set;
    }

    public static int getSumOfSet(ArrayList<Treasure> set) {
        int sum = 0;
        for (Treasure item :
                set) {
            sum += item.getCost();
        }
        return sum;
    }

    private int getGlobalId() {
        int id = 0;
        if (this.bank.size() == 0) return ++id;
        ++id;
        for (int i = 0; i < this.bank.size(); i++) {
            if (this.bank.get(i).getId() != id) {
                return id;
            }
            id++;
        }
        return id;
    }

    public void sort() {
        this.bank.sort(Comparator.comparing(Treasure::getCost));
    }

    public ArrayList<Treasure> chooseTreasures(int yourMoney) {
        sort();
        ArrayList<Treasure> set = new ArrayList<>();
        int sum = 0;
        for (int i = this.bank.size() - 1; i >= 0; i--) {
            if (this.bank.get(i).getCost() + sum <= yourMoney) {
                set.add(this.bank.get(i));
                sum += this.bank.get(i).getCost();
            }
        }
        return set;
    }
}
