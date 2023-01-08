public class Method_Overloading {
    // Function with 1 parameter
    public int multiply(int x){
        System.out.println("Function with one parameter: ");
        return x * x;
    }

    // Function with 2 argument with same data type
    public int multiply(int x, int y){
        System.out.println("Function with 2 argument (int) [ Same data type ]");
        return x * y;
    }
     public double multiply(double x, double y){
        System.out.println("Function with 2 parameter(Double) [ Same data type ] ");
        return x * y;
    }

    public float multiply(float x, long y){
        System.out.println("Function with 2 arguments(Float), (Long): ");
        // Explicit Typecasting
        return (long) (x * y);
    }
    public static void main(String[] args) {
        Method_Overloading methodOverloading = new Method_Overloading();
        System.out.println(methodOverloading.multiply(5));
        System.out.println(methodOverloading.multiply(5,2));
        System.out.println(methodOverloading.multiply(345.3,123.45));
        System.out.println(methodOverloading.multiply(123234.6789, 1234123.23414));
    }
}
