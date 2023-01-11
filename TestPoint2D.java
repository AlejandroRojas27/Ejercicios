import java.awt.geom.Point2D;
import java.util.Scanner;



public class TestPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextFloat();
        double y1 = input.nextFloat();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextFloat();
        double y2 = input.nextFloat();

        Point2D p1 = new Point2D.Double(x1, y1);
        Point2D p2 = new Point2D.Double(x2, y2);
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
        //System.out.println("The midpoint between p1 and p2 is: " + p1.midpoint(p2).toString());
    }
}
