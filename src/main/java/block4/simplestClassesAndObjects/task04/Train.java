package block4.simplestClassesAndObjects.task04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train {
    private static final Scanner scanner = new Scanner(System.in);
    private String destination;
    private int trainNumber;
    private LocalDateTime departureTime;

    public Train(String destination, int trainNumber, String date) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y H:m");
        this.departureTime = LocalDateTime.parse(date, formatter);
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String toString() {
        return "Train: №" + this.trainNumber + "; To: " + this.destination + "; Time: " + this.departureTime.toString();
    }

    public static void sortByTrainNumber(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getTrainNumber() - o2.getTrainNumber();
            }
        });
    }

    public static void sortByTrainDestination(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) {
                    return o1.getDepartureTime().compareTo(o2.getDepartureTime());
                } else return o1.getDestination().compareTo(o2.getDestination());
            }
        });
    }

    public static void getInfo(Train[] trains) {
        boolean flag = true;
        System.out.println("Input train number: ");
        int number = Integer.parseInt(scanner.next());
        for (int i = 0; i < trains.length; i++) {
            if (number == trains[i].getTrainNumber()) {
                System.out.println(trains[i].toString());
                flag = false;
            }
        }
        if (flag) System.out.println("Train doesn't exist!");
    }
}
