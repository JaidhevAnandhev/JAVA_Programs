import java.text.NumberFormat;

public class Implicit_Explicit_typecasting {
    public static void main(String[] args){
        // Implicit typecasting
        short num = 3;
        int sum = num + 5;
        System.out.println(sum);

        double x = 1.1;
        double y = x+2; //2 is int
        System.out.println(y);

        //Explicit casting
        double x1 = 24.12;
        int y1 = (int) x1 + 2;
        System.out.println(y1);

        // String to integer casting
        //Not applicable for double and float
        String str_int = "1";
        int out = Integer.parseInt(str_int) + 100;
        System.out.println(out);

        // Converting string to int (In case of Double)
        String str_db = "2.4";
        double out_db = Double.parseDouble(str_db) + 108;
        System.out.println(out_db);

        // Math class in Java
        // Rounding a float value
        System.out.println("Rounding a value:-");
        int result = Math.round(1.6F);
        System.out.println(result);

        //ceil
        System.out.println("CEIL :-");
        int res = (int) Math.ceil(1.1F);
        System.out.println(res);

        //floor
        System.out.println("FLOOR:-");
        int res1 = (int) Math.floor(1.6F);
        System.out.println(res1);

        // Max and min
        System.out.println("Max of a number :-");
        int max1 = Math.max(24,12);
        int min1 = Math.min(24,12);
        System.out.print("Max = ");
        System.out.println(max1);
        System.out.print("Min = ");
        System.out.println(min1);

        // Random
        System.out.println("Any Random value :-");
        double value = Math.random();
        System.out.println(value);

        //Rounding off the random value
        // Printing like this will always display either 1 or 0
        System.out.println("Rounding off any Random value(Int) :-");
        int val_int = (int) Math.round(Math.random() *100);
        int result_int = (int) (Math.random() * 100);
        System.out.println(result_int);
        System.out.println(val_int);

        System.out.println("Rounding off any Random value (Double):-");
        double val_db =  Math.round(Math.random()*100);
        System.out.println(val_db);

        //Formatting Numbers
        System.out.println("Percentage value :-");
        // Returns the output in string format
        String per_val = NumberFormat.getPercentInstance().format(2.4);
        System.out.println(per_val);





    }
}
