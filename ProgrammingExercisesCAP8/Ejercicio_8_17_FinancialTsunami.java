package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_17_FinancialTsunami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of banks: ");
        int numberOfBanks = input.nextInt();
        System.out.print("Enter the minimum total assets for keeping a bank safe (limit): ");
        double limit = input.nextDouble();
        System.out.println(" ");

        double[] balance = new double[numberOfBanks];
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];

        for (int i = 0; i < numberOfBanks; i++) {
            int loansCount = 0;
            System.out.println("---------------------------------");
            System.out.println("Data of the bank   " + i);
            System.out.println("---------------------------------");

            System.out.println(" ");

            System.out.print("Balance: ");
            balance[i] = input.nextDouble();
            System.out.print("Number of loans : ");
            loansCount = input.nextInt();

            for (int j = 0; j < loansCount; j++) {
                System.out.println(" ");
                System.out.println("Data of the " + (j + 1) + " borrower");
                System.out.println(" ");
                System.out.print("Borrower’s ID: ");
                int borrowersID = input.nextInt();
                System.out.print("Amount borrowed: ");
                borrowers[i][borrowersID] = input.nextDouble();
            }


        }

        System.out.println("---------------------------------");

        System.out.print("Unsafe banks are: ");

        for (int i = borrowers[0].length - 1; i >= 0; i--) {
            if (Ejercicio_8_1_SumElementsColumnByColumn.sumColumn(checkUnsafe(borrowers, balance, limit), i) == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        System.out.println("---------------------------------");


    }

    public static double[][] checkUnsafe(double[][] borrowers, double[] balance, double limit) {
        for (int x = 0; x < borrowers.length; x++) {
            for (int i = 0; i < borrowers.length; i++) {
                double loans = 0;
                for (int j = 0; j < borrowers[i].length; j++) {
                    loans += borrowers[i][j];

                }
                if ((balance[i] + loans) < limit) {  //Check if is unsafe
                    for (int j = 0; j < borrowers.length; j++) {
                        borrowers[j][i] = 0;
                    }
                }

            }
        }
        return borrowers;
    }
}
