package ProgrammingExercisesCAP10;

import java.util.Date;

public class Account {
    /**
     * A private int data field named id for the account (default 0).
     */
    private int id;

    /**
     * A private double data field named balance for the account (default 0).
     */
    private double balance;

    /**
     * A private double data field named annualInterestRate that stores the current interest rate (default 0).
     * Assume that all accounts have the same interest rate.
     */
    private double annualInterestRate;

    /**
     * A private Date data field named dateCreated that stores the date when the
     * account was created.
     */
    Date data = new Date();
    private final String dateCreated = data.toString();

    /**
     * A no-arg constructor that creates a default account.
     */
    public Account() {

    }

    /**
     * A constructor that creates an account with the specified id and initial balance.
     */
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }

    /**
     * The accessor and mutator methods for id, balance, and annualInterestRate.
     */
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    /**
     * The accessor method for dateCreated.
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * A method named getMonthlyInterestRate() that returns the monthly
     * interest rate.
     */

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    /**
     * A method named getMonthlyInterest() that returns the monthly interest
     */
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    /**
     * A method named withdraw that withdraws a specified amount from the
     * account.
     */

    public void withdraw(double newWithdraw) {
        balance -= newWithdraw;
    }


    /**
     * A method named deposit that deposits a specified amount to the account.
     */

    public void deposit(double newDeposit) {
        balance += newDeposit;
    }

}
