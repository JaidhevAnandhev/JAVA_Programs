public class Normal_Class {
    int number = 20;
    private int number_1 = 24;

    // Non-static class
     class Normal_Inner_Class{
        void display(){
            System.out.println("Accessing int number = " + number);
            System.out.println("Accessing private int number_1 = " + number_1);
        }
    }

}
