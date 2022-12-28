import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args){

        // Getting a number as input
        System.out.print("Age = ");
        String age = new Scanner(System.in).next();
        System.out.println("You are " + age);

        // Getting a string as an input
        //Takes only one token at a time
        System.out.print("Name = ");
        String name = new Scanner(System.in).next();
        System.out.println("You are " + name);

        // Get a string as an input
        // Collects Multiple tokens at a time
        //Also we can trim the name (Remove the whitespaces)
        System.out.print("Full Name = ");
        String f_name = new Scanner(System.in).nextLine().trim();
        System.out.println("You are " + f_name);

        System.out.println("Your Details :-\n" + "Name = \t" + f_name + "\nAge = \t" + age);

    }
}
