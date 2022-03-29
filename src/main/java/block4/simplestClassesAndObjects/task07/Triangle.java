package block4.simplestClassesAndObjects.task07;

public class Triangle {
    Point pA;
    Point pB;
    Point pC;

    public Triangle(Point pA, Point pB, Point pC) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }

    public Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        this.pA = new Point(Ax, Ay);
        this.pB = new Point(Bx, By);
        this.pC = new Point(Cx, Cy);
    }

    public Triangle() {
        this.pA = new Point(0, 0);
        this.pB = new Point(3, 0);
        this.pC = new Point(0, 4);
    }

    public Point getMedianCrossPoint() {
        double x = (pA.getX() + pB.getX() + pC.getX()) / 3;
        double y = (pA.getY() + pB.getY() + pC.getY()) / 3;
        return new Point(x, y);
    }

    public double getArea() {
        double mainDiagonalMatrix = (pA.getX() - pC.getX()) * (pB.getY() - pC.getY());
        double offDiagonalMatrix = (pB.getX() - pC.getX()) * (pA.getY() - pC.getY());
        return 0.5 * (mainDiagonalMatrix - offDiagonalMatrix);
    }

    public double getPerimeter() {
        return getSideLength(this.pA, this.pB) + getSideLength(this.pA, this.pC) + getSideLength(this.pB, this.pC);
    }

    private double getSideLength(Point a, Point b) {
        double projectionX2 = Math.pow(a.getX() - b.getX(), 2);
        double projectionY2 = Math.pow(a.getY() - b.getY(), 2);
        return Math.sqrt(projectionX2 + projectionY2);
    }


}
