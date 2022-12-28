import java.util.Scanner;

public class Operators_Java {
    public static void main(String[] args){

        // Comparison operators will return boolean value
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("X = ");
        x = input.nextInt();
        System.out.print("Y = ");
        y = input.nextInt();
        System.out.println(x == y);
        System.out.println(x <= y);
        System.out.println(x >= y);

        // Logical operators
        System.out.print("Temperature = ");
        int temperature = input.nextInt();
        boolean isWarm =  temperature > 20 && temperature <= 30; //Logical AND Operator (&&)
        System.out.println(isWarm);
        boolean isCold = temperature > -12 || temperature  <= 10; // Logical OR Operator (||)
        System.out.println(isCold);
        System.out.println(!true); // Logical NOT Operator (!)





    }
}
