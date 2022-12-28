import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String [] args){
        final byte Months_In_Year = 12;
        final byte Percent = 100;

        // Standard syntax in Java to get an input via console
        Scanner input = new Scanner(System.in);

        // Principal
        System.out.print("Principal = ");
        int Principal = input.nextInt();

        // Annual Interest rate
        System.out.print("Annual Interest = ");
        float Annual_Interest = input.nextFloat();

        // Monthly Interest
        float Monthly_Interest = Annual_Interest / Percent / Months_In_Year;

        //Period(Years)
        System.out.print("Years = ");
        byte year = input.nextByte();

        // Number of payments
        int Number_of_Payments = year * Months_In_Year;

        // Calculate the Mortgage
        //Formula
        double Mortgage = Principal * (Monthly_Interest * Math.pow(1+Monthly_Interest, Number_of_Payments))
                            / (Math.pow(1+Monthly_Interest, Number_of_Payments) - 1);

        // Formatting the output value
        String Mortgage_formatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage: " + Mortgage_formatted);





    }
}
