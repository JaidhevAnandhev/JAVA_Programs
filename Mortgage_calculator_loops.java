import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_calculator_loops {
    public static void main(String[] args) {

        final byte Months_In_Year = 12;
        final byte Percent = 100;
        int Principal = 0;
        float Annual_Interest = 0;
        byte year = 0;

        // Standard syntax in Java to get an input via console
        Scanner input = new Scanner(System.in);

        // Principal
        while (true){
            System.out.print("Principal = ");
            Principal = input.nextInt();
            if (!(Principal > 1000 && Principal <= 100000))
                break;
            else
                continue;
        }
        System.out.println("Enter a value between 1000 and 100000");


        // Annual Interest rate
        while (true)
        {
            System.out.print("Annual Interest = ");
            Annual_Interest = input.nextFloat();
            if (!(Annual_Interest > 10 && Annual_Interest < 20))
                break;
            else
                continue;
        }
        System.out.println("Enter a value between 10 and 20");



        // Monthly Interest
        float Monthly_Interest = Annual_Interest / Percent / Months_In_Year;

        //Period(Years)
        while (true){
            System.out.print("Years = ");
            year = input.nextByte();
            if(!(year > 0 && year < 10))
                break;
            else
                continue;
        }
        System.out.println("Enter a year between 1 and 10.");

        // Number of payments
        int Number_of_Payments = year * Months_In_Year;

        // Calculate the Mortgage
        //Formula
        double Mortgage = Principal * (Monthly_Interest * Math.pow(1 + Monthly_Interest, Number_of_Payments))
                / (Math.pow(1 + Monthly_Interest, Number_of_Payments) - 1);

        // Formatting the output value
        String Mortgage_formatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage: " + Mortgage_formatted);

    }
}

