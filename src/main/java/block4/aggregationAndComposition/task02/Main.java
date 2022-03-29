package block4.aggregationAndComposition.task02;

/**
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {
        Wheel[] base = new Wheel[]{
                new Wheel(2008, 17),
                new Wheel(2008, 17),
                new Wheel(2008, 17),
                new Wheel(2008, 17),
        };
        Wheel wheel = new Wheel(2010, 17);
        Engine vw = new Engine(2003, "VW");
        Car car = new Car(vw.getModel(), vw, base);
        car.printMark();
        car.move();
        car.refuel(14);
        car.stop();
        car.refuel(14);
        car.move();
        car.changeWheel(wheel, 2);
        car.stop();
        car.changeWheel(wheel,2);
    }
}
