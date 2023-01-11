package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_12_FinancialApplicationComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Filing statuses");
        System.out.println("Enter:");
        System.out.println("0 for single filers ");
        System.out.println("1 for married filing jointly or qualified widow(er)");
        System.out.println("2 for married filing separately");
        System.out.println("3 for head of household");
        System.out.print("What is your status? ");
        int status = 2;//input.nextInt();

        System.out.println("For a income of: ");
        double income = 50000;//input.nextDouble();


        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        computeTax(status, income, rates, brackets);

        System.out.println("Your total tax is: " + (int) (computeTax(status, income, rates, brackets) * 100) / 100.0);

    }

    public static double computeTax(int status, double income, double[] rates, int[][] brackets) {
        double tax = 0;

        if (income <= brackets[status][0]) {
            tax = income * rates[0];
        } else if (income <= brackets[status][1]) {
            tax = ((brackets[status][0] * rates[0])
                    + (income - brackets[status][0]) * rates[1]);
        } else if (income <= brackets[status][2]) {
            tax = ((brackets[status][0] * rates[0])
                    + (brackets[status][1] - brackets[status][0]) * rates[1]
                    + (income - brackets[status][1]) * rates[2]);
        } else if (income <= brackets[status][3]) {
            tax = ((brackets[status][0] * rates[0])
                    + (brackets[status][1] - brackets[status][0]) * rates[1]
                    + (brackets[status][2] - brackets[status][1]) * rates[2]
                    + (income - brackets[status][2]) * rates[3]);
        } else if (income <= brackets[status][4]) {
            tax = ((brackets[status][0] * rates[0])
                    + (brackets[status][1] - brackets[status][0]) * rates[1]
                    + (brackets[status][2] - brackets[status][1]) * rates[2]
                    + (brackets[status][3] - brackets[status][2]) * rates[3]
                    + (income - brackets[status][3]) * rates[4]);
        } else {
            tax = ((brackets[status][0] * rates[0])
                    + (brackets[status][1] - brackets[status][0]) * rates[1]
                    + (brackets[status][2] - brackets[status][1]) * rates[2]
                    + (brackets[status][3] - brackets[status][2]) * rates[3]
                    + (brackets[status][4] - brackets[status][3]) * rates[4]
                    + (income - brackets[status][4]) * rates[5]);
        }

        return tax;
    }
}
