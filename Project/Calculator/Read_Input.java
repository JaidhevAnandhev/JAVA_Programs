import java.util.Scanner;

public class Read_Input {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a4+3-2 mathematical expression: \nFor Example: 4+3/2-1*6");

        String inputLine = scanner.nextLine();
        scanner.close();
        return inputLine;
    }
}
