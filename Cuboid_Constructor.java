import java.util.Scanner;

public class Cuboid_Constructor {
        int width;
        int height;
        int depth;

        // Creating a constructor
        //  With three arguments
        Cuboid_Constructor(int Width, int Height, int Depth){
            this.width = Width;
            this.depth = Depth;
            this.height = Height;
        }

        // Constructor with two arguments
        Cuboid_Constructor(int Width, int Height){
            this.height = Height;
            this.width = Width;
            depth = 10;
        }

        // Constructor with one argument
        Cuboid_Constructor(int dim){
            // It is a cube now
            this.height = dim;
            this.width = dim;
            this.depth = dim;
        }


    int Volume(){
            return width * height * depth;
        }

    public static void main(String[] args) {
        int w, h, d;
        Cuboid_Constructor cuboid = new Cuboid_Constructor(1,2);
        System.out.println("Volume = " + cuboid.Volume());

        Cuboid_Constructor cuboid1 = new Cuboid_Constructor(5);
        System.out.println("Volume = " + cuboid1.Volume());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width: ");
        w = input.nextInt();
        System.out.print("Enter a Height: ");
        h = input.nextInt();
        System.out.print("Enter a Depth: ");
        d = input.nextInt();
        Cuboid_Constructor cuboid2 = new Cuboid_Constructor(w, h, d);
        System.out.println("Volume = " + cuboid2.Volume());



    }
}

