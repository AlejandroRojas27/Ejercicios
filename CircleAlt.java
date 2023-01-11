public class CircleAlt {
    /**Main method */
    public static void main(String[] args){
        //Create a circle with radius 1
        CircleAlt circle1 = new CircleAlt();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        //Create a circle with radius 25
        CircleAlt circle2 = new CircleAlt(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        //Create a circle with radius 125
        CircleAlt circle3 = new CircleAlt(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        //Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    /** Construct a circle with radius 1 */
    CircleAlt(){
        radius = 1;
    }

    /** Construct a circle with a specified radius */
    CircleAlt(double newRadius){
        radius = newRadius;
    }

    /** Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }

    /** Return the perimeter of this circle */
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /** Set a new radius for this circle */
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
