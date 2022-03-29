package block4.simplestClassesAndObjects.task10;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Airline {
    enum TypePlane {
        PASSENGER,
        MILITARY,
        CARGO
    }

    enum Days {
        MONDAY("понедельник"),
        TUESDAY("вторник"),
        WEDNESDAY("среда"),
        THURSDAY("четверг"),
        FRIDAY("пятница"),
        SATURDAY("суббота"),
        SUNDAY("воскресенье");
        private String ru;
        Days(String ru) {
            this.ru = ru;
        }

        public String getRu() {
            return ru;
        }
    }
    String destination;
    int number;
    TypePlane type;
    String time;
    Days[] days;

    public Airline(String destination, int number, TypePlane type, String time, Days ...dayToDay) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.time = time;
        this.days = new Days[dayToDay.length];
        System.arraycopy(dayToDay,0,this.days,0,dayToDay.length);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TypePlane getType() {
        return type;
    }

    public void setType(TypePlane type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Days[] getDays() {
        return days;
    }

    public void setDays(Days[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", type=" + type +
                ", time=" + time +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
