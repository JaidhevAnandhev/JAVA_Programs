public class Shapes_Abstract {
    public static void main(String[] args) {
        Base_Abstract Circle = new Circle_Abstract();
        Circle.Draw();
        Circle.Resize();

        Base_Abstract Rectangle = new Rectangle_Abstract();
        Rectangle.Draw();
        Rectangle.Resize();
    }
}

