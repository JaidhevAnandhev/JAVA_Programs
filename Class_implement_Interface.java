public class Class_implement_Interface implements Interface_extend, Interface_extend_1 {

    // Must contain some parameter in the parentheses in case of the interface
    @Override
    public void method_1() {
        System.out.println("I am from Interface_Extend ");
    }

    @Override
    public void method_2() {
        System.out.println("I am from Interface_Extend_2");
    }

    @Override
    public void method_3() {
        System.out.println("I am from Interface_3 via Interface_extend_2 ");
    }
}
