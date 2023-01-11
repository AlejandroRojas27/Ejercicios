package ProgrammingExercisesCAP10;


import java.util.Scanner;

public class Ejercicio_10_7_GameATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Declare array
        Account[] accounts;

        //Create array
        accounts = createAccounts();

        System.out.print("Enter an id: ");
        int idPromt = input.nextInt();

        for (int i = 0; i < 1; ) {
            if (idPromt < 0 || idPromt > 9) {
                System.out.print("The id is entered incorrectly, to enter a correct id: ");
                idPromt = input.nextInt();
            } else {
                System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[idPromt].getBalance());
                        break;
                    case 2: {
                        System.out.print("Enter an amount to withdraw: ");
                        accounts[idPromt].withdraw(input.nextDouble());
                    }
                    break;
                    case 3: {
                        System.out.print("Enter an amount to deposit: ");
                        accounts[idPromt].deposit(input.nextDouble());
                    }
                    break;
                    case 4: {
                        System.out.print("Enter an id: ");
                        idPromt = input.nextInt();
                    }
                    break;

                }

            }

        }

    }

    public static Account[] createAccounts() {
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        return accounts;
    }
}
