class Student_Static {
    // Nested class
    static  {
        // Static keyword applied on the variable
        System.out.println("Initializer code");
    }
        String Name;
        int Age;
        String Address;
        static String College = "SRM";
        static int count = 0;


         public Student_Static(String name, int age, String address){
             this.Name = name;
             this.Address = address;
             this.Age = age;
         }

        public String getName() {
            return Name;
        }

        public int getAge() {
            return Age;
        }

        public String getAddress() {
            return Address;
        }

        public String getCollege() {
            return College;
        }

    @Override
    public String toString() {
        return "Student_Static{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                '}';
    }

    int stu_getCount(){
             return count += 1;
        }
}
