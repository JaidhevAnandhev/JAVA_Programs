import java.util.Scanner;

public class Divisibility_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = input.nextInt();
        if (number % 5 == 0 || number % 3 == 0) 
            System.out.println(number + " is divisible by both 3 and 5.");
        else if(number % 5 == 0)
            System.out.println(number + " divisible by 5.");
        else if (number % 3 == 0) {
            System.out.println(number + " divisible by 3.");
        }
        else
            System.out.println("Enter a number that is divisible by 3 and 5.");


    }
}
