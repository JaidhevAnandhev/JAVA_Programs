import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Object_Menu extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();
    // Creating a HashMap
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() {
        do {
            try {
                data.put(1234, 6001);
                data.put(5678, 6002);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!Welcome to ABC ATM!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Enter Customer Number = ");
                setCustomerNumber(input.nextInt());
                System.out.print("Enter PIN Number = ");
                setPinNumber(input.nextInt());
            }
            catch (Exception e){
                System.out.println("Characters are not allowed.🤨");
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();

            // Check if the given numbers are available at HashMap
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            }
            else
                System.out.println("Wrong customer/Pin number.🤨");
        }while (true);

    }
    public void getAccountType(){
        System.out.println("\nSelect the Account Type: ");
        System.out.println("1. Checking account.");
        System.out.println("2. Saving Account.");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();

        // Actions implemented according to the choices selected using switch case
        switch (choice) {
            case 1 -> {
                getChecking();
                getAccountType();
            }
            case 2 -> {
                getSaving();
                getAccountType();
            }
            case 3 -> {
                System.out.println("Thank you Visit again 🙏🏻!");
                System.exit(0);
            }
            default -> System.out.println("Enter a correct choice🤨");
        }

        }
    // Function implementation for getChecking()
    public void getChecking(){
        System.out.println("\n" + customerNumber + "'s CHECKING ACCOUNT");
        System.out.println("1. Check the Balance.");
        System.out.println("2. Withdraw fund.");
        System.out.println("3. Deposit fund.");
        System.out.println("4. Exit");
        System.out.print("Enter the choice: ");
        int Checking_choice = input.nextInt();

        // Create a switch case condition
        switch (Checking_choice) {
            case 1 -> {
                System.out.println("Your balance amount in your account = " + moneyFormat.format(checkingBalance));
                getChecking();
            }
            case 2 -> {
                getCheckingWithdraw();
                getChecking();
            }
            case 3 -> {
                getCheckingDeposit();
                getChecking();
            }
            case 4 -> {
                System.out.println("Thank you for accessing your Checking account 🙏🏻!");
                System.out.println("Welcome Again🙏🏻🙏🏻");
            }
            default -> System.out.println("Enter a valid choice.");
        }

    }

    // Function implementation for getSaving()
    public void getSaving() {
        System.out.println("\n" + customerNumber + "'s SAVINGS ACCOUNT");
        System.out.println("1. Check the Balance.");
        System.out.println("2. Withdraw fund.");
        System.out.println("3. Deposit fund.");
        System.out.println("4. Exit");
        System.out.print("Enter the choice: ");
        int Saving_choice = input.nextInt();

        // Create a switch case condition
        switch (Saving_choice) {
            case 1 -> {
                System.out.println("Your balance in your account: " + moneyFormat.format(savingBalance));
                getSaving();
            }
            case 2 -> {
                getSavingWithdraw();
                getSaving();
            }
            case 3 -> {
                getSavingDeposit();
                getSaving();
            }
            case 4 -> System.out.println("Thank you for accessing your Savings account. 🙏🏻");
            default -> System.out.println("Enter a correct choice.🤨");
        }

    }
}
