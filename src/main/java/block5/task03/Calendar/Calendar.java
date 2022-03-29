package block5.task03.Calendar;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

public class Calendar {
    private ArrayList<Date> list;

    public Calendar(Date... dates) {
        this();
        this.list.addAll(Arrays.asList(dates));
    }

    public Calendar() {
        this.list = new ArrayList<>();
    }

    public void print() {
        System.out.println("Calendar has:");
        for (Date date :
                this.list) {
            System.out.println(date);
        }
        System.out.println();
    }

    public void add(Date date) {
        this.list.add(date);
    }

    public void add(Date... dates) {
        this.list.addAll(Arrays.asList(dates));
    }

    public Date getDate(int number, Month month) {
        for (Date date :
                this.list) {
            if (date.getNumber() == number && date.getMonth().getValue() == month.getValue()) return date;
        }
        return null;
    }

    public ArrayList<Date> getDateByType(DateType dateType) {
        ArrayList<Date> dates = new ArrayList<>();
        for (Date date :
                this.list) {
            if (dateType.getType().equals(date.getDateType().getType())) dates.add(date);
        }
        return dates;
    }

    public void setTypeDate(int number, Month month, DateType dateType) {
        for (Date date :
                this.list) {
            if (date.getNumber() == number && date.getMonth().getValue() == month.getValue())
                date.setDateType(dateType);
        }
    }

    public void remove(int number, Month month) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getNumber() == number && this.list.get(i).getMonth().getValue() == month.getValue()) {
                this.list.remove(i);
                break;
            }
        }
    }

    public enum DateType {
        WEEKDAY("Будня"), WEEKEND("Выходной"), HOLIDAY("Праздник");

        private String type;

        DateType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class Date {
        private int number;
        private Month month;
        private DateType dateType;

        public Date(int number, Month month, DateType dateType) {
            this.number = number;
            this.month = month;
            this.dateType = dateType;
        }

        public int getNumber() {
            return number;
        }

        public Month getMonth() {
            return month;
        }

        public DateType getDateType() {
            return dateType;
        }

        public void setDateType(DateType dateType) {
            this.dateType = dateType;
        }

        @Override
        public String toString() {
            return "Day " + this.number + " " + this.month + " (" + this.dateType.getType() + ")";
        }
    }
}
