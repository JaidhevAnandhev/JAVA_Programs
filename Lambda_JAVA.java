public class Lambda_JAVA {
    public static void main(String[] args) {

        Abstract_Class_Lambda lambdaPrintable =  (s) -> {
            System.out.println("MEOW" + s);
            return s;
        };
        PrintThing(lambdaPrintable);

    }
    static void PrintThing(Abstract_Class_Lambda thing){
        thing.cat("!!!");
    }



}
