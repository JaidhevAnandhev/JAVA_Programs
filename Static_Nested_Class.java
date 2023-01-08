public class Static_Nested_Class {
    int number = 22;
    static int number_1 = 24;
    private static final int December = 25;

    // Creating a static nested class
    static class Inner_Class{
        // Accessing members of Outer Class
        void Display(){
            System.out.println("Accessing int number = " + number_1);
            System.out.println("Accessing  private static final int December = " + December);
        }
    }
}
