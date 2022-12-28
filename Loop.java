import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        // For loop
        for (int i = 0; i<5; i++)
            System.out.println("Hello World " + (i+1));

        for(int j = 5; j>0; j--)
            System.out.println("Reverse for loop " + (j) );

        // While loop
        System.out.println("\n\n");
        int i = 5;
        while (i > 0){
            System.out.println("Welcome to while loop " + i);
            i--;
        }

        System.out.println("\n\n");
        int j = 0;
        while (j < 5){
            System.out.println("Welcome to while loop 2 " + (j+1));
            j++;
        }

        // Accept any string input and exit the loop while I type the word "Quit"
        /*Scanner input = new Scanner(System.in);
        String name = "";
        while (!name.equals("quit")) {
            System.out.println("Enter a word = ");
            name = input.next().toLowerCase();
            System.out.println(name);
        }*/

        // Do while loop
       /* do {
            System.out.println("Enter a word = ");
            name = input.next().toLowerCase();
            System.out.println(name);
        }while (!name.equals("quit"));*/

        // Displaying the array values
        String[] fruits = {"Apple", "Mango", "Pineapple", "Banana"};
        for (int k = 0; k < fruits.length; k++ )
            System.out.println(fruits[k]);

        // Other way of displaying the items in an array using for loop
        System.out.println("\n\nEasiest way to display the items in an for loop");
        for(String fruit : fruits)
            System.out.println(fruit);



    }
}
