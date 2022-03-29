package block4.simplestClassesAndObjects.task01;

public class Test1 {
    private int first;
    private int second;

    /**
     * Find max value of the first and the second vars.
     * @return max value of vars.
     */
    public int getMaxOfVars() {
        return Math.max(this.first, this.second);
    }

    /**
     * Return sum of two vars.
     * @return sum of first and second vars.
     */
    public int sum() {
        return this.first + this.second;
    }
    /**
     * Changes first var.
     * @param first value that needs to put at first var.
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * Changes second var.
     * @param second value that need to put at second var.
     */
    public void setSecond(int second) {
        this.second = second;
    }

    /**
     * Prints both vars.
     */
    public void printVars() {
        System.out.println("First = " + this.first);
        System.out.println("Second = " + this.second);
    }

    public Test1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Test1() {
    }
}
