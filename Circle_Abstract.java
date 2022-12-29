// Inheritance takes place
public class Circle_Abstract extends Base_Abstract{

    @Override
    void Draw() {
        System.out.println("Drawing a circle.");
    }
    @Override
    void Resize() {
        System.out.println("Resizing a circle");
    }
}
