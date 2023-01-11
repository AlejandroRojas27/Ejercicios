package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Date;

public class Ejercicio_11_8_NewAccountClass {
    public static void main(String[] args) {

        NewAccount newAccount = new NewAccount("George", 1122,1000);
        newAccount.setAnnualInterestRate(1.5);

        newAccount.deposit(30);
        newAccount.deposit(40);
        newAccount.deposit(50);

        newAccount.withdraw(5);
        newAccount.withdraw(4);
        newAccount.withdraw(2);

        System.out.println("Name: " + newAccount.getName());
        System.out.println("Monthly interest rate: " + newAccount.getMonthlyInterestRate());
        System.out.println("Annual interest rate: " + newAccount.getAnnualInterestRate());
        System.out.println("Balance: " + newAccount.getBalance());
        System.out.println(newAccount.getTransactions());


    }
}

class NewAccount {

    /**
     * Add a new data field name of the String type to store the name of the
     * customer.
     */
    private String name;

    /**
     * Add a new data field named transactions whose type is ArrayList
     * that stores the transaction for the accounts.
     * Each transaction is an instance of the Transaction class
     */
    private ArrayList<Transaction> transactions = new ArrayList<>();

    private int id;

    private double balance;

    private double annualInterestRate;

    private java.util.Date dateCreated;

    public NewAccount() {
    }

    /**
     * Add a new constructor that constructs an account with the specified name, id, and balance.
     */

    public NewAccount(String name, int newId, double newBalance) {
        this.name = name;
        this.id = newId;
        this.balance = newBalance;
    }

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

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return Math.round(balance * (annualInterestRate / 1200) * 100.0) / 100.0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /** Modify the withdraw and deposit methods to add a transaction to the transactions array list. */

    public void withdraw(double withdraw) {
        balance -= withdraw;
        java.util.Date date = new Date();

        transactions.add(new Transaction('W', withdraw, balance,"\nWithdraw made " + date +
                "\nFor an amount of " + withdraw));
    }

    public void deposit(double deposit) {
        balance += deposit;
        java.util.Date date = new Date();
        transactions.add(new Transaction('D', deposit, balance,"\nDeposit made " + date +
                "\nFor an amount of " + deposit));
    }

    @Override
    public String toString() {
        return "Info of the account with " + getId() + " ID: " +
                "\n The balance is $" + getBalance() +
                "\n The monthly interest is $" + getMonthlyInterest() +
                "\n The date when was created: " + getDateCreated();
    }

}

class Transaction {
    private java.util.Date date;

    private char type;

    private double amount;

    private double balance;

    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return getDescription();
    }

}
