import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Loan payments
        System.out.println("Loan payments");
        System.out.println(" ");
        System.out.print("Loan Amount: $");
        double loanAmount = input.nextDouble();
        System.out.print("Annual interest rate: %");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Numbers of years: ");
        double numbersOfYears = input.nextDouble();

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow((1 + monthlyInterestRate),(numbersOfYears * 12 )) )));
        double totalPayment = monthlyPayment * numbersOfYears * 12;

        System.out.println("Monthly Payment: $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment: $" + (int)(totalPayment * 100) / 100.0);
    }
}
