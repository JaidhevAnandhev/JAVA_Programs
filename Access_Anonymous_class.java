public class Access_Anonymous_class {
    public static void main(String[] args) {
        Normal_Inheritance normalInheritance = new Normal_Inheritance() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }

            @Override
            public void display_name() {
                System.out.println("My name is Jaidhev");
            }
        };

        normalInheritance.display();
        normalInheritance.display_name();
    }
}
