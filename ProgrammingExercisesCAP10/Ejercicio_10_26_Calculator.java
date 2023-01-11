package ProgrammingExercisesCAP10;

import java.util.Scanner;

public class Ejercicio_10_26_Calculator {
    public static void main(String[] args) {

        String input = "3+4";
        Calculator calculator = new Calculator(input);
        System.out.println(calculator.getResult());
    }

}

class Calculator {

    private String string;

    Calculator(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }

    public char getOperator() {
        char opp = ' ';

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '*' || string.charAt(i) == '+' || string.charAt(i) == '-'
                    || string.charAt(i) == '/' || string.charAt(i) == 'x' || string.charAt(i) == 'X') {
                opp = string.charAt(i);
                break;
            }
        }

        return opp;
    }

    private double firstNum() {
        String st = "";
        if (Character.isDigit(string.charAt(0))) {

            for (int i = 0; i < string.length(); i++) {
                if (Character.isDigit(string.charAt(i)) || string.charAt(i) == '.') {
                    st += string.charAt(i);
                } else {
                    break;
                }

            }
        } else {
            int index = 0;
            for (int i = 0; i < string.length(); i++) {
                if (Character.isDigit(string.charAt(i))) {
                    index = i;
                    break;
                }
            }

            for (int i = index; i < string.length(); i++) {
                if (Character.isDigit(string.charAt(i)) || string.charAt(i) == '.') {
                    st += string.charAt(i);
                } else {
                    break;
                }
            }
        }

        return Double.parseDouble(st);
    }
    private double secondNum() {

        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == getOperator()) {
                index = i;
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = index; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)) || string.charAt(i) == '.') {
                str.append(string.charAt(i));
            }
        }

        return Double.parseDouble(str.toString());
    }

    public double getResult() {
        return switch (getOperator()) {
            case '+' -> firstNum() + secondNum();
            case '-' -> firstNum() - secondNum();
            case '*', 'x', 'X' -> firstNum() * secondNum();
            case '/' -> firstNum() / secondNum();
            default -> 0;
        };
    }

}
