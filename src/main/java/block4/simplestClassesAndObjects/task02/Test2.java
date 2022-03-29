package block4.simplestClassesAndObjects.task02;

public class Test2 {
    private int first;
    private int second;

    public Test2(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Test2() {
        this(0,0);
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void printVars() {
        System.out.println("First = " + this.first);
        System.out.println("Second = " + this.second);
    }
}
