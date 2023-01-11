package ProgrammingExercisesCAP10;

import java.util.Scanner;

public class Ejercicio_10_2_TheBMIClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height feet: ");
        double heightFT = input.nextDouble();

        System.out.print("Enter height inches: ");
        double heightIn = input.nextDouble();

        BMI bmi1 = new BMI(name, age, weight, heightFT, heightIn);
        System.out.println(bmi1.getName() + "'s  height in meters " + bmi1.getHeight());
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

    }
}

class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double heightFt; // in feets
    private double heightIn; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_FEET = .3048;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double heightFt, double heightIn) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.heightFt = heightFt;
        this.heightIn = heightIn;

    }

    public double getBMI() {;
        double bmi = weight * KILOGRAMS_PER_POUND /
                Math.pow(((heightFt * METERS_PER_FEET) + (heightIn * METERS_PER_INCH)), 2);
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return ((heightIn * METERS_PER_INCH) + (heightFt * METERS_PER_FEET));
    }


}
