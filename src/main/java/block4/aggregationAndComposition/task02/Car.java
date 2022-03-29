package block4.aggregationAndComposition.task02;

public class Car {
    private String mark;
    private Wheel[] base;
    private Engine carEngine;
    private boolean isMoving;

    {
        base = new Wheel[]{null, null, null, null};
        isMoving = false;
    }

    public Car(String mark, Engine carEngine, Wheel... wheels) {
        this.mark = mark;
        this.carEngine = carEngine;
        try {
            for (int i = 0; i < 4; i++) {
                base[i] = wheels[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перед движением добавь колёс!");
        }

    }

    public Car() {

    }

    public void move() {
        if (checkCar()) {
            System.out.println("Car is moving");
            isMoving = true;
        }
        else {
            System.out.println("Check car equip!");
        }
    }
    public void stop() {
        System.out.println("Car was stopped.");
        isMoving = false;
    }

    public void refuel(int liters) {
        if (!isMoving && carEngine!=null) {
            System.out.println("Car is refueling...");
            while (liters>0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Oops!");
                }
                liters--;
                System.out.printf("Liters is remaining: %d\n", liters);
            }
        }
        else {
            System.out.println("Impossible to refuel car! Stop driving! Or check engine!");
        }
    }

    public void changeWheel(Wheel wheel, int number) {
        try {
            if(!isMoving) {
                this.base[number] = wheel;
                System.out.println("Wheel has changed!");
            }
            else {
                System.out.println("Can't change the wheel!!!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Куды суеш!");
        }
    }

    public void printMark() {
        System.out.println(this.mark);
    }

    private boolean checkCar() {
        try {
            for (int i = 0; i < base.length; i++) {
                if (base[i].isBroken()) return false;
            }
            if (carEngine.isBroken()) return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}
