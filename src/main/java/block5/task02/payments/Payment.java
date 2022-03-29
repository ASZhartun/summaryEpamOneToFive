package block5.task02.payments;

import java.util.ArrayList;
import java.util.Comparator;

public class Payment {

    private ArrayList<Item> shoppingList;

    public Payment() {
        shoppingList = new ArrayList<>();
    }

    public void addItem(Item item) {
        item.setId(this.getGlobalId());
        shoppingList.add(item);
        sort();
    }

    public void addItem(Item ... items) {
        for (Item item :
                items) {
            item.setId(this.getGlobalId());
            shoppingList.add(item);
        }
        sort();
    }

    public void removeItem(Item item) {
        shoppingList.remove(item);
        refreshId();
    }

    public void removeItem(int id) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).getId() == id) {
                shoppingList.remove(i);
                break;
            }
        }
        refreshId();
    }

    public void print() {
        for (Item item :
                shoppingList) {
            System.out.println(item);
        }
    }

    private int getGlobalId() {
        int id = 0;
        if (this.shoppingList.size() == 0) return ++id;
        ++id;
        for (int i = 0; i < this.shoppingList.size(); i++) {
            if (this.shoppingList.get(i).getId() != id) {
                return id;
            }
            id++;
        }
        return id;
    }

    private void sort() {
        this.shoppingList.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    private void refreshId() {
        int id = 1;
        for (int i = 0; i < this.shoppingList.size(); i++) {
            this.shoppingList.get(i).setId(id);
            id++;
        }
    }

    public static class Item {
        private String name;
        private double price;
        private int id;
        private static int globalId = 0;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Item() {
            this("nothing", 0);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "[id: " + id + "; " + name + " for " + price + ']';
        }

    }
}
