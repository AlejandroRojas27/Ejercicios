package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_8_TheFanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Fan fan1 = new Fan();

        System.out.println("Set speed (Slow, Medium or Maximum): ");
        fan1.setSpeed(input.next());

        System.out.println("Set radius: ");
        fan1.setRadius(input.nextDouble());

        System.out.println("Set color: ");
        fan1.setColor(input.next());

        System.out.println("Set on (true) / off (false)");
        fan1.setOn(input.nextBoolean());

        System.out.println("---------- Fan 1 ----------");
        System.out.println(fan1.toStringFan());

        Fan fan2 = new Fan();

        System.out.println("Set speed (Slow, Medium or Maximum): ");
        fan2.setSpeed(input.next());

        System.out.println("Set radius: ");
        fan2.setRadius(input.nextDouble());

        System.out.println("Set color: ");
        fan2.setColor(input.next());

        System.out.println("Set on (true) / off (false)");
        fan2.setOn(input.nextBoolean());



        System.out.println("---------- Fan 2 ----------");
        System.out.println(fan2.toStringFan());




    }
}

class Fan {
    /**
     * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
     * to denote the fan speed.
     */
    private final int SLOW = 1;

    private final int MEDIUM = 2;

    private final int FAST = 3;

    /**
     * A private int data field named speed that specifies the speed of the fan (the
     * default is SLOW).
     */

    private int speed = SLOW;

    /**
     * A private boolean data field named on that specifies whether the fan is on (the
     * default is false).
     */
    private boolean on;

    /**
     * A private double data field named radius that specifies the radius of the fan
     * (the default is 5).
     */
    private double radius = 5;

    /**
     * A string data field named color that specifies the color of the fan (the default
     * is blue).
     */
    public String color = "blue";

    /**
     * The accessor and mutator methods for all four data fields.
     */

    //Speed

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(String newSpeed) {
        if(newSpeed == "Slow"){
          speed = SLOW;
        } else if (newSpeed == "Medium") {
            speed = MEDIUM;
        } else if (newSpeed == "Maximum") {
            speed = FAST;
        }
    }

    //On

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    //Radius

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    //Color

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    /**
     * A no-arg constructor that creates a default fan.
     */
    public Fan() {

    }

    /**
     * A method named toString()
     */
    public String toStringFan() {

        String sp = " ";
        if (speed == SLOW) {
            sp = "Slow";
        } else if (speed == MEDIUM) {
            sp = "Medium";
        } else if (speed == FAST) {
            sp = "Maximum";
        }


        String stOn = "The speed is " + sp + ", the color is " + color + " and the radius is " + String.valueOf(radius) + ".";

        String stOff = "The color is " + color + ", the radius is " + String.valueOf(radius) + " and the fan is off.";

        return (on) ? stOn : stOff;
    }

}
