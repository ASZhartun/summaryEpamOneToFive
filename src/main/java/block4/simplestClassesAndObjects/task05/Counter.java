package block4.simplestClassesAndObjects.task05;

public class Counter {
    private long count;
    private long bottom;
    private long top;


    public Counter(long count, long bottom, long top) {
        if (count < bottom) {
            this.count = bottom;
        } else if (count > top) {
            this.count = top;
        } else {
            this.count = count;
        }
        this.top = top;
        this.bottom = bottom;
    }

    public Counter() {
        this(0, -9, 9);
    }

    public void increment() {
        if (this.count != this.top) {
            this.count++;
        }
    }

    public void decrement() {
        if (this.count != this.bottom) {
            this.count--;
        }
    }

    public long getCount() {
        System.out.println("Count value: " + this.count);
        return count;
    }
}
