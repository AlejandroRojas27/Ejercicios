package ProgrammingExercisesCAP9;

public class Ejercicio_9_9_GeometryNSidedRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);

        System.out.println("Regular polygon 1, area: " + regularPolygon1.getArea());
        System.out.println("Regular polygon 1, perimeter: " + regularPolygon1.getPerimeter());

        RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular polygon 2, area: " + regularPolygon2.getArea());
        System.out.println("Regular polygon 2, perimeter: " + regularPolygon2.getPerimeter());


    }
}

class RegularPolygon {

    /**
     * A private int data field named n that defines the number of sides in the polygon
     * with default value 3.
     */
    private int n = 3;

    /**
     * A private double data field named side that stores the length of the side with
     * default value 1.
     */
    private double side = 1;

    /**
     * A private double data field named x that defines the x-coordinate of the polygon’s center
     * with default value 0.
     */
    private double x;

    /**
     * A private double data field named y that defines the y-coordinate of the polygon’s center
     * with default value 0.
     */
    private double y;

    /**
     * A no-arg constructor that creates a regular polygon with default values.
     */
    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    /**
     * A constructor that creates a regular polygon with the specified number of sides
     * and length of side, centered at (0, 0).
     */
    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = 0;
        y = 0;
    }

    /**
     * A constructor that creates a regular polygon with the specified number of sides,
     * length of side, and x- and y-coordinates.
     */
    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    /**
     * The accessor and mutator methods for all data fields.
     */
    // n
    public int getN() {
        return n;
    }

    public void setN(int newN) {
        n = newN;
    }

    // side
    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
        side = newSide;
    }

    // x
    public double getX() {
        return x;
    }

    public void setX(double newX) {
        x = newX;
    }

    //y
    public double getY() {
        return y;
    }

    public void setY(double newY) {
        y = newY;
    }

    /**
     * The method getPerimeter() that returns the perimeter of the polygon.
     */
    public double getPerimeter() {
        return side * n;
    }

    /**
     * The method getArea() that returns the area of the polygon.
     */
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
