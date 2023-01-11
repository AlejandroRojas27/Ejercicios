package ProgrammingExercisesCAP9;


public class Ejercicio_9_1_TheRectangleClass {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("The area of the rectangle1 of width " + rectangle1.width
                + " is and height " + rectangle1.height + " is " + rectangle1.getArea()
                + " and the perimeter is " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The area of the rectangle2 of width " + rectangle2.width
                + " is and height " + rectangle2.height + " is " + rectangle2.getArea()
                + " and the perimeter is " + rectangle2.getPerimeter());

    }

}

class Rectangle {

    /**
     * Two double data fields named width and height that specify the width and height of the rectangle.
     * The default values are 1 for both width and height.
     */
    public double width = 1;
    public double height = 1;

    /**
     * A no-arg constructor that creates a default rectangle
     */
    public Rectangle() {
    }

    /**
     * A constructor that creates a rectangle with the specified width and height.
     */
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /**
     * A method named getArea() that returns the area of this rectangle.
     */
    public double getArea() {
        return width * height;
    }

    /**
     * A method named getPerimeter() that returns the perimeter.
     */
    public double getPerimeter() {
        return width + width + height + height;
    }

}



