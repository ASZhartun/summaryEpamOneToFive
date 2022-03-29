package block4.simplestClassesAndObjects.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineAggregator {
    ArrayList<Airline> list;

    {
        list = new ArrayList<>();
    }

    public AirlineAggregator(Airline airline) {
        this.list.add(airline);
    }

    public AirlineAggregator(Airline[] airlines) {
        this.list.addAll(Arrays.stream(airlines).toList());
    }

    public AirlineAggregator(Collection<? extends Airline> airlines) {
        this.list.addAll(airlines);
    }

    public AirlineAggregator() {

    }

    public ArrayList<Airline> getList() {
        return list;
    }

    public void printList() {
        System.out.println("List of airlines: ");
        for (Airline item :
                this.list) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public ArrayList<Airline> getListByDestination(String destination) {
        ArrayList<Airline> sample = new ArrayList<>();
        for (Airline item : this.list) {
            if (item.getDestination().equals(destination)) {
                sample.add(item);
            }
        }
        return sample;
    }

    public ArrayList<Airline> getListByDayOfWeek(Airline.Days day) {
        ArrayList<Airline> sample = new ArrayList<>();
        for (Airline item : this.list) {
            if (airlineHasDay(day, item)) {
                sample.add(item);
            }
        }
        return sample;
    }

    public ArrayList<Airline> getListByDayAndTimeGreater(Airline.Days day, String time) {
        ArrayList<Airline> sample = new ArrayList<>();
        sample.addAll(getListByDayOfWeek(day).stream()
                .filter(item -> item.getTime().compareTo(time) > 0)
                .collect(Collectors.toList()));
        return sample;
    }

    public void addAirline(Airline airline) {
        this.list.add(airline);
    }

    public void addAirline(Airline[] airlines) {
        this.list.addAll(Arrays.stream(airlines).toList());
    }

    public void addAirline(Collection<? extends Airline> airlines) {
        this.list.addAll(airlines);
    }

    private boolean airlineHasDay(Airline.Days day, Airline airline) {
        for (Airline.Days item : airline.getDays()) {
            if (item.getRu().equals(day.getRu())) {
                return true;
            }
        }
        return false;
    }
}
