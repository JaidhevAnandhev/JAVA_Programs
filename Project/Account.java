import java.util.Scanner;

public class Account {
    // Data Member
    int customerNumber;
    int pinNumber;
    double checkingBalance = 0;
    double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    // Set customer number


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customer_Number) {
        this.customerNumber = customer_Number;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    // Create a function to calculate Checking Withdraw
    public double calcCheckingWithdraw(double amount){
        checkingBalance -= amount;
        return checkingBalance;
    }
    // Create a function to calculate Saving Withdraw
    public double calcSavingWithdraw(double amount){
        savingBalance -= amount;
        return savingBalance;
    }

    // Create a function to calculate Checking Deposit
    public double calcCheckingDeposit(double amount){
        checkingBalance += amount;
        return checkingBalance;
    }

    // Create a function to calculate Saving Deposit
    public double calcSavingDeposit(double amount){
        savingBalance += amount;
        return savingBalance;
    }

    // User action for selecting Checking Withdraw
    public void getCheckingWithdraw(){
        System.out.print("Balance Amount @ Icici Bank= " + checkingBalance + "\n");
        System.out.print("Enter the Amount you want to withdraw from your Checking account = ");
        double amount = input.nextDouble();

        // check if the amount is always greater than or equal to zero using if statement
        if ((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
        }
        else {
            System.out.println("Balance amount cannot be negative.🤨");
        }
    }

    // User action for selecting Saving Withdraw
    public void getSavingWithdraw(){
        System.out.print("Balance Amount @ Icici Bank= " + savingBalance + "\n");
        System.out.print("Enter the Amount you want to withdraw from your Saving account = ");
        double amount = input.nextDouble();

        // check if the amount is always greater than or equal to zero using if statement
        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
        }
        else {
            System.out.println("Balance amount cannot be negative.🤨");
        }
    }

    // User action for selecting Checking Deposit
    public void getCheckingDeposit(){
        System.out.print("Balance Amount @ Icici Bank= " + checkingBalance + "\n");
        System.out.print("Enter the Amount you want to Deposit at Checking account = ");
        double amount = input.nextDouble();

        // check if the amount is always greater than or equal to zero using if statement
        if ((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
        }
        else {
            System.out.println("Balance amount cannot be negative.🤨");
        }
    }

    // User action for selecting Saving Deposit
    public void getSavingDeposit(){
        System.out.print("Balance Amount @ Icici Bank= " + savingBalance + "\n");
        System.out.print("Enter the Amount you want to Deposit in your Savings account = ");
        double amount = input.nextDouble();

        // check if the amount is always greater than or equal to zero using if statement
        if ((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
        }
        else {
            System.out.println("Balance amount cannot be negative.🤨");
        }
    }

}
