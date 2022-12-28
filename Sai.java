import java.util.Scanner;

public class Sai {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name please = ");
        String name_1 = name.next();
        System.out.print("Enter your age = ");
        byte age = name.nextByte();
        System.out.println("Your name is =  " + name_1);
        System.out.println("Your age is = " + age);

    }
}
