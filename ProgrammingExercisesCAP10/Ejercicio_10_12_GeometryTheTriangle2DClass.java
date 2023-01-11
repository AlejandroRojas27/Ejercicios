package ProgrammingExercisesCAP10;


import java.awt.geom.Line2D;

public class Ejercicio_10_12_GeometryTheTriangle2DClass {
    public static void main(String[] args) {


        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("----------    t1    ----------");
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("t1.contains(3, 3): " + t1.contains(new MyPoint(3, 3)));
        System.out.println("t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))): "
                + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("t1 .overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint (4, –3), new MyPoint(2, 6.5))): " +
                t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

        System.out.println("----------    t2    ----------");
        Triangle2D t2 = new Triangle2D(new MyPoint(1, 1), new MyPoint(11, 1), new MyPoint(1, 11));
        Triangle2D t3 = new Triangle2D(new MyPoint(6, 9), new MyPoint(10, 7), new MyPoint(6, 7));
        System.out.println("AREA: " + t2.getArea());
        System.out.println("PERIMETER: " + t2.getPerimeter());
        System.out.println("t2.contains(2.5,2): " + t2.contains(new MyPoint(2.5, 2)));
        System.out.println("t2.contains(t1): " + t2.contains(t1));
        System.out.println("t2.overlaps(t1): " + t2.overlaps(t3));
    }
}

class Triangle2D {

    /**
     * Three points named p1, p2, and p3 of the type MyPoint with getter and
     * setter methods. MyPoint is defined
     */

    private MyPoint p1 = new MyPoint(0, 0);
    private MyPoint p2 = new MyPoint(1, 1);
    private MyPoint p3 = new MyPoint(2, 5);

    /**
     * A no-arg constructor that creates a default triangle with the points (0, 0),
     * (1, 1), and (2, 5).
     */
    public Triangle2D() {
    }

    /**
     * A constructor that creates a triangle with the specified points.
     */
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * A method getArea() that returns the area of the triangle.
     */
    public double getArea() {
        return computeArea(p1, p2, p3);
    }

    private static double computeArea(MyPoint pr1, MyPoint pr2, MyPoint pr3) {
        double side1 = pr1.distance(pr2);
        double side2 = pr2.distance(pr3);
        double side3 = pr1.distance(pr3);
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * A method getPerimeter() that returns the perimeter of the triangle.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * A method contains(MyPoint p) that returns true if the specified point
     * p is inside this triangle
     */
    public boolean contains(MyPoint p) {

        double a1 = computeArea(this.p1, this.p2, p);
        double a2 = computeArea(this.p2, this.p3, p);
        double a3 = computeArea(this.p3, this.p1, p);

        return getArea() == Math.round(a1 + a2 + a3);
    }

    /**
     * A method contains(Triangle2D t) that returns true if the specified
     * triangle is inside this triangle
     */
    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    /**
     * A method overlaps(Triangle2D t) that returns true if the specified
     * triangle overlaps with this triangle (see Figure 10.22c).
     */


    public boolean overlaps(Triangle2D t) {

        Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
        Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
        Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

        return contains(t) || t.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3);
    }


    /**
     * GETTERS AND SETTERS (Accessor and mutator)
     */

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
