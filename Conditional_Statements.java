import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args){

        // If-Else Statement
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature = ");
        int temp = input.nextInt();
        if(temp > 30)
            System.out.println("Temperature is above 30");
        else if(temp >= 20 && temp < 30)
            System.out.println("Temperature is between 20 and 30");
        else
            System.out.println("Temperature is less than 20");



        // Simplifying If statements
        int income = 100_000;
        boolean hasIncome = (income > 100_000);
        System.out.println(hasIncome);

        // Ternary Operator
        int income_1 = 120_000;
        String className = (income_1 >= 100_00) ? "Economy" : "Primary";
        System.out.println(className);

        // Switch Statements
        System.out.print("Enter your role = ");
        String role = input.next();
        switch (role)
        {
            case "Admin":
                System.out.println("You are an " + role);
                break;
            case "Principal":
                System.out.println("You are a " + role);
                break;
            case "HR":
                System.out.println("You are the " + role);
                break;
            default:
                System.out.println("Enter a correct name.");
        }
    }
}
