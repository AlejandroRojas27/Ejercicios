package ProgrammingExercisesCAP10;

public class Ejercicio_10_11_GeometryTheCircle2DClass {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.printf("-----------   c1: (%.2f, %.2f), radius: %.2f    -----------\n",
                c1.getX(), c1.getY(), c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("c1.contains(3,3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));



    }
}

class Circle2D {

    /**
     * Two double data fields named x and y that specify the center of the circle
     * with getter methods.
     */
    private double x;
    private double y;

    /**
     * A data field radius with a getter method.
     */
    private double radius = 1;

    /**
     * A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
     * for radius.
     */

    public Circle2D() {
    }

    /**
     * A constructor that creates a circle with the specified x, y, and radius.
     */
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * A method getArea() that returns the area of the circle.
     */

    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * A method getPerimeter() that returns the perimeter of the circle.
     */

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * A method contains(double x, double y) that returns true if the
     * specified point (x, y) is inside this circle
     */
    public boolean contains(double x, double y) {
        return distanceBetweenTheTwoCenters(this.x, this.y, x,y) <= radius;
    }

    /**
     * A method contains(Circle2D circle) that returns true if the specified
     * circle is inside this circle
     */
    public boolean contains(Circle2D circle2D) {
        return distanceBetweenTheTwoCenters(this.x, this.y, circle2D.getX(), circle2D.y) <= (this.radius - circle2D.getRadius());
    }

    /**
     * A method overlaps(Circle2D circle) that returns true if the specified
     * circle overlaps with this circle
     */
    public boolean overlaps(Circle2D circle2D) {
        return distanceBetweenTheTwoCenters(this.x, this.y, circle2D.getX(), circle2D.y) <= (this.radius + circle2D.getRadius());
    }

    private double distanceBetweenTheTwoCenters(double x1, double y1, double x2, double y2) {
        return Math.pow(((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))), 0.5);
    }


    /**
     * GETTERS
     */

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }


}
