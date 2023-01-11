package ProgrammingExercisesCAP10;

import java.awt.geom.Line2D;

public class Ejercicio_10_13_GeometryTheMyRectangle2DClass {
    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("----------    r1    ----------");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("r1.contains(3, 3): " + r1.contains(3, 3));
        System.out.println("r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)): " +
                r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): " +
                r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));


    }
}

class MyRectangle2D {

    /**
     * Two double data fields named x and y that specify the center of the rectangle
     * with getter and setter methods. (Assume the rectangle sides are parallel to
     * x- or y-axis.)
     */

    private double x;
    private double y;

    /**
     * The data fields width and height with getter and setter methods.
     */

    private double width;

    private double height;

    /**
     * A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
     * 1 for both width and height.
     */

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }


    /**
     * A constructor that creates a rectangle with the specified x, y, width, and
     * height
     */

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * A method getArea() that returns the area of the rectangle.
     */
    public double getArea() {
        return (float) this.width * this.height;
    }

    /**
     * A method getPerimeter() that returns the perimeter of the rectangle.
     */
    public double getPerimeter() {
        return width + width + height + height;
    }

    /**
     * A method contains(double x, double y) that returns true if the
     * specified point (x, y) is inside this rectangle.
     */
    public boolean contains(double x, double y) {

        Triangle2D t1 = new Triangle2D(this.cornerTopLeft(), this.cornerTopRight(), new MyPoint(x, y));
        Triangle2D t2 = new Triangle2D(this.cornerTopRight(), this.cornerBottomRight(), new MyPoint(x, y));
        Triangle2D t3 = new Triangle2D(this.cornerBottomLeft(), this.cornerBottomRight(), new MyPoint(x, y));
        Triangle2D t4 = new Triangle2D(this.cornerTopLeft(), this.cornerBottomLeft(), new MyPoint(x, y));

        float areaTotal = (float) getArea();
        float areaSum = (float) (t1.getArea() + t2.getArea() + t3.getArea() + t4.getArea());

        return areaTotal == areaSum;
    }

    /**
     * A method contains(MyRectangle2D r) that returns true if the specified
     * rectangle is inside this rectangle
     */
    public boolean contains(MyRectangle2D r) {
        return contains(r.cornerTopLeft().getX(), r.cornerTopLeft().getY()) &&
                contains(r.cornerTopRight().getX(), r.cornerTopRight().getY()) &&
                contains(r.cornerBottomLeft().getX(), r.cornerBottomLeft().getY()) &&
                contains(r.cornerBottomRight().getX(), r.cornerBottomRight().getY());

    }

    /**
     * A method overlaps(MyRectangle2D r) that returns true if the specified
     * rectangle overlaps with this rectangle
     */
    public boolean overlaps(MyRectangle2D r) {

        Line2D line2DTop = new Line2D.Double(r.cornerTopLeft().getX(), r.cornerTopLeft().getY(),
                r.cornerTopRight().getX(), r.cornerTopRight().getY());

        Line2D line2DBottom = new Line2D.Double(r.cornerBottomLeft().getX(), r.cornerBottomLeft().getY(),
                r.cornerBottomRight().getX(), r.cornerBottomRight().getY());

        Line2D line2DLeft = new Line2D.Double(r.cornerTopLeft().getX(), r.cornerTopLeft().getY(),
                r.cornerBottomLeft().getX(), r.cornerBottomLeft().getY());

        Line2D line2DRight = new Line2D.Double(r.cornerTopRight().getX(), r.cornerTopRight().getY(),
                r.cornerBottomRight().getX(), r.cornerBottomRight().getY());


        Line2D side2DTop = new Line2D.Double(cornerTopLeft().getX(), cornerTopLeft().getY(),
                cornerTopRight().getX(), cornerTopRight().getY());

        Line2D side2DBottom = new Line2D.Double(cornerBottomLeft().getX(), cornerBottomLeft().getY(),
                cornerBottomRight().getX(), cornerBottomRight().getY());

        Line2D side2DLeft = new Line2D.Double(cornerTopLeft().getX(), cornerTopLeft().getY(),
                cornerBottomLeft().getX(), cornerBottomLeft().getY());

        Line2D side2DRight = new Line2D.Double(cornerTopRight().getX(), cornerTopRight().getY(),
                cornerBottomRight().getX(), cornerBottomRight().getY());

        return contains(r) || r.contains(this) ||
                line2DTop.intersectsLine(side2DTop) ||
                line2DTop.intersectsLine(side2DBottom) ||
                line2DTop.intersectsLine(side2DLeft) ||
                line2DTop.intersectsLine(side2DRight) ||
                line2DBottom.intersectsLine(side2DTop) ||
                line2DBottom.intersectsLine(side2DBottom) ||
                line2DBottom.intersectsLine(side2DLeft) ||
                line2DBottom.intersectsLine(side2DRight) ||
                line2DLeft.intersectsLine(side2DTop) ||
                line2DLeft.intersectsLine(side2DBottom) ||
                line2DLeft.intersectsLine(side2DLeft) ||
                line2DLeft.intersectsLine(side2DRight) ||
                line2DRight.intersectsLine(side2DTop) ||
                line2DRight.intersectsLine(side2DBottom) ||
                line2DRight.intersectsLine(side2DLeft) ||
                line2DRight.intersectsLine(side2DRight);
    }


    /**
     * Getter (accessor) and setters (mutator)
     */

    public MyPoint cornerTopLeft() {
        return new MyPoint((this.x - (this.width / 2)), (this.y + (this.height / 2)));
    }

    public MyPoint cornerTopRight() {
        return new MyPoint((this.x + (this.width / 2)), (this.y + (this.height / 2)));
    }

    public MyPoint cornerBottomLeft() {
        return new MyPoint((this.x - (this.width / 2)), (this.y - (this.height / 2)));
    }

    public MyPoint cornerBottomRight() {
        return new MyPoint((this.x + (this.width / 2)), (this.y - (this.height / 2)));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
