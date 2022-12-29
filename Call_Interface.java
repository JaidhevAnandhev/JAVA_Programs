public class Call_Interface {
    public static void main(String[] args) {

        Mountain_Bike_Interface mountainBikeInterface;
        mountainBikeInterface = new Mountain_Bike_Interface();

        System.out.println( mountainBikeInterface.toString());
        mountainBikeInterface.applyBrake(10);
        System.out.println("After applying the brake = " + mountainBikeInterface.getSpeed());

        mountainBikeInterface.speedUp(30);
        System.out.println("After increasing the speed = " + mountainBikeInterface.getSpeed());

        System.out.println("Gear applied is = " + mountainBikeInterface.getGear());

        System.out.println("Seat height is = " + mountainBikeInterface.getSeatHeight());

        mountainBikeInterface.display();

        mountainBikeInterface.display_i3();


    }
}
