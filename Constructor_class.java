import java.util.Scanner;

public class Constructor_class {

    String Name;
    int Age;
    String Address;

    public Constructor_class(String name_1, int age_1, String address_1){
        this.Name = name_1;
        this.Age = age_1;
        this.Address = address_1;
    }

//    public void setName(String name_2){
//        this.Name = name_2;
//    }
//
//    public void setAge(int age_2){
//        this.Age = age_2;
//    }
//
//    public void setAddress(String address_2){
//        this.Address = address_2;
//    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public String toString() {
        return ("Student Name is : " + this.getName() + "\nAge : " + this.getAge() + "\nAddress : " + this.getAddress());
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String i_name = scanner.next().toUpperCase();
        System.out.print("Enter your age : ");
        int i_age = scanner.nextInt();
        System.out.print("Enter your address : ");
        String i_Address = scanner.next().trim();
        Constructor_class John = new Constructor_class(i_name, i_age, i_Address);
        // Overrides toString in class Object John.
        System.out.println(John);
    }
}
