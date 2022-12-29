public class Encapsulation {

        private String Name;
        private int age;
        private  String Address;

   public Encapsulation(String name, int age, String address){
            this.Name = name;
            this.Address =address;
            this.age = age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        @Override
        public String toString() {
            return "Encapsulation { \n " +
                    "Student Name= " + Name + "\n" +
                    " Student age= " + age + "\n" +
                    " Student Address= " + Address + "\n" +
                    '}';
        }

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation("Jaidhev", 19, "Chennai");
        System.out.println(encapsulation);
    }

}
