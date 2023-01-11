package ProgrammingExercisesCAP11;

import java.util.Scanner;

public class Ejercicio_11_1_TheTriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Side 3: ");
        double side3 = input.nextDouble();

        System.out.print("Color of the triangle: ");
        String color = input.next();
        System.out.print("The triangle is filled? ");
        boolean isFilled = input.nextBoolean();


        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.println("------------------------------------------------");
        System.out.println(triangle.toString());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle is filled? " + triangle.isFilled());
        System.out.println("Triangle color: " + triangle.getColor());


    }

}

class Triangle extends GeometricObject {
    /**
     * Three double data fields named side1, side2, and side3 with
     * default values 1.0 to denote three sides of a triangle.
     */
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**
     * A no-arg constructor that creates a default triangle.
     */
    public Triangle() {
    }

    /**
     * ■ A constructor that creates a triangle with the specified side1, side2, and side3.
     * The accessor methods for all three data fields.
     */

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * A method named getArea() that returns the area of this triangle.
     */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow((s - side1) * (s - side2) * (s - side3) * s, 0.5);
    }

    /**
     * A method named getPerimeter() that returns the perimeter of this triangle.
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * A method named toString() that returns a string description for the triangle.
     */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

    /**
     * Getters
     */

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    private double getSide3() {
        return side3;
    }
}
