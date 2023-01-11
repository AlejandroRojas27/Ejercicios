package ProgrammingExercisesCAP10;

import java.util.Arrays;

public class Ejercicio_10_3_TheMyIntegerClass {
    public static void main(String[] args) {

        int num = 2;

        MyInteger myInteger = new MyInteger(num);

        System.out.println(myInteger.getValue() + " is even? " + myInteger.isEven());
        System.out.println(myInteger.getValue() + " is odd? " + myInteger.isOdd());
        System.out.println(myInteger.getValue() + " is prime? " + myInteger.isPrime());

        System.out.println("------------------------------------------------------------------");

        int num1 = 3;

        System.out.println(num1 + " is even? " + MyInteger.isEven(num1));
        System.out.println(num1 + " is odd? " + MyInteger.isOdd(num1));
        System.out.println(num1 + " is prime? " + MyInteger.isPrime(num1));

        System.out.println("------------------------------------------------------------------");

        MyInteger myInteger1 = new MyInteger(20);

        System.out.println(myInteger1.getValue() + " is even? " + MyInteger.isEven(myInteger1));
        System.out.println(myInteger1.getValue() + " is odd? " + MyInteger.isOdd(myInteger1));
        System.out.println(myInteger1.getValue() + " is prime? " + MyInteger.isPrime(myInteger1));

        System.out.println("------------------------------------------------------------------");

        int num2 = 20;
        System.out.println(myInteger1.getValue() + " is equal to " + num2 + "? "
                + myInteger1.equals(num2));
        System.out.println(myInteger1.getValue() + " is equal to " + myInteger.getValue() + "? "
                + myInteger1.equals(myInteger));

        System.out.println("------------------------------------------------------------------");

        char[] array = {'2','7','1','2','9','6'};
        System.out.println("The array " + Arrays.toString(array ) + " to int value: " + MyInteger.parseInt(array));

        System.out.println("------------------------------------------------------------------");

        String s = "007";
        System.out.println("The String " + s + " to int value: " + MyInteger.parseInt(s));

        System.out.println("------------------------------------------------------------------");

    }
}

class MyInteger {

    /**
     * An int data field named value that stores the int value represented by
     * this object.
     */
    private int value;

    /**
     * A constructor that creates a MyInteger object for the specified int value.
     */

    public MyInteger(int value) {
        this.value = value;
    }


    /**
     * A getter method that returns the int value.
     */
    public int getValue() {
        return value;
    }

    /**
     * The methods isEven(), isOdd(), and isPrime() that return true if the
     * value in this object is even, odd, or prime, respectively.
     */
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        //Assume the number prime
        boolean isPrime = true;
        //Test whether number is prime
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) { //If true, number is not prime
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    /**
     * The static methods isEven(int), isOdd(int), and isPrime(int) that
     * return true if the specified value is even, odd, or prime, respectively.
     */

    public static boolean isEven(int valueX) {
        return valueX % 2 == 0;
    }

    public static boolean isOdd(int valueX) {
        return valueX % 2 != 0;
    }

    public static boolean isPrime(int valueX) {
        //Assume the number prime
        boolean isPrime = true;
        //Test whether number is prime
        for (int divisor = 2; divisor <= valueX / 2; divisor++) {
            if (valueX % divisor == 0) { //If true, number is not prime
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    /**
     * The static methods isEven(MyInteger), isOdd(MyInteger), and
     * isPrime(MyInteger) that return true if the specified value is even, odd,
     * or prime, respectively.
     */

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        //Assume the number prime
        boolean isPrime = true;
        //Test whether number is prime
        for (int divisor = 2; divisor <= myInteger.getValue() / 2; divisor++) {
            if (myInteger.getValue() % divisor == 0) { //If true, number is not prime
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    /**
     * The methods equals(int) and equals(MyInteger) that return true if
     * the value in this object is equal to the specified value.
     */

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    /** A static method parseInt(char[]) that converts an array of numeric
     characters to an int value. */

    public static int parseInt(char[] a){
        return Integer.parseInt(String.valueOf(a));
    }

    /** A static method parseInt(String) that converts a string into an int value. */
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }


}
