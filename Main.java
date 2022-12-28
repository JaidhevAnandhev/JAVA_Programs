import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Point point_1 = new Point(1, 2);
        Point point_2 = point_1;
        point_2.y  = 3;
        System.out.println(point_2);

    }
}