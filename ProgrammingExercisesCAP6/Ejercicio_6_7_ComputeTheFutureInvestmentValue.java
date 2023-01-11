package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_7_ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInteresRate = input.nextDouble();
        double monthlyInterestRate = annualInteresRate / 1200;
        System.out.print("From year 1 to:");
        int years = input.nextInt();
        futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
       int x = 0;
        System.out.println("Year     Future Value");
       for (x=1;x<=years;x++){
           double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (x * 12));
           System.out.printf("%d     %10.2f\n", x, futureInvestmentValue);
       }
       return x;
    }
}
