package ProgrammingExercisesCAP10;

public class Ejercicio_10_4_TheMyPointClass {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,30.5);

        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is %.10f\n",
                p1.getX(), p1.getY(), p2.getX(), p2.getY(), p1.distance(p2));


        System.out.println("Distance: " + MyPoint.distance(p1,p2));
        System.out.println("Distance: " + p1.distance(10,30.5) );

        MyPoint p3 = new MyPoint(1, 11);
        System.out.println("Distance: ");

    }
}

class MyPoint{

    /** The data fields x and y that represent the coordinates with getter methods. */
    private double x;
    private double y;

    /** A no-arg constructor that creates a point (0, 0). */
    public MyPoint(){
    }

    /** A constructor that constructs a point with specified coordinates. */
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    /** Getters */

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /** A method named distance that returns the distance from this point to a
     specified point of the MyPoint type. */
    public double distance(MyPoint secondPoint){
        return distance(this, secondPoint);
    }

    /** A method named distance that returns the distance from this point to
     another point with specified x- and y-coordinates. */
    public double distance(double x, double y){
        MyPoint temp = new MyPoint(x, y);
        return distance(this, temp);
    }



    /** A static method named distance that returns the distance from two MyPoint
     objects. */

    public static double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y)));
    }

}
