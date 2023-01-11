package ProgrammingExercisesCAP11;

public class Ejercicio_11_3_SubclassesOfAccount {
    public static void main(String[] args) {

        Account account = new Account(1, 1000);
        account.setAnnualInterestRate(2.5);
        System.out.println(account);

        SavingAccount savingAccount = new SavingAccount(2, 2000);
        savingAccount.setAnnualInterestRate(2.5);
        System.out.println(savingAccount);

        CheckingAccount checkingAccount = new CheckingAccount(3, 1000);
        checkingAccount.setAnnualInterestRate(2.5);
        checkingAccount.withdraw(1050);
        System.out.println(checkingAccount);

    }
}

class SavingAccount extends Account{
    public SavingAccount(int id, double newBalance){
        setId(id);
        setBalance(newBalance);
    }

    @Override
    public String toString(){
        return "Info of the saving account with $" + getId() + " ID: " +
                "\n The balance is " + getBalance() +
                "\n The monthly interest is $" + getMonthlyInterest() +
                "\n The date when was created: " + getDateCreated();
    }
}

class CheckingAccount extends Account{

    public CheckingAccount(int id, double newBalance){
        setId(id);
        setBalance(newBalance);
    }

    public String status(){
        return (getBalance() < 0)? "Overdrawn account": "Positive balance";
    }

    @Override
    public String toString(){
        return "Info of the checking account with " + getId() + " ID: " +
                "\n The balance is $" + getBalance() +
                "\n Status of the account: " + status() +
                "\n The monthly interest is $" + getMonthlyInterest() +
                "\n The date when was created: " + getDateCreated();
    }

}

