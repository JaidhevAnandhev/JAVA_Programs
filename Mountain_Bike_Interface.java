
public class Mountain_Bike_Interface implements Bicycle_Interface, Interface_2{

    private int seatHeight;
    private int gear;
    private int speed;

//    public Mountain_Bike_Interface(int Speed, int seat_Height, int Gear){
//        this.speed = Speed;
//        this.seatHeight = seat_Height;
//        this.gear = Gear;
//    }

    public Mountain_Bike_Interface() {
        setSpeed(20);
        setSeatHeight(10);
        setGear(2);
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void display() {
        System.out.println("Interface implemented from Mountain bike");
    }

    @Override
    public void display_i3() {
        System.out.println("Hello Interface i3");
    }

    public int setSpeed(int Speed) {
        this.speed = Speed;
        return Speed;
    }

    public int setSeatHeight(int seat_Height) {
        this.seatHeight = seat_Height;
        return seat_Height;
    }

    public int setGear(int Gear) {
        this.gear = Gear;
        return Gear;
    }

    public int getSpeed() {
        return setSpeed(20);
    }

    public int getSeatHeight() {
        return setSeatHeight(10);
    }

    public int getGear() {
        return setGear(2);
    }

    @Override
    public String toString() {
        return "Mountain_Bike_Interface{" +
                "seatHeight= " + seatHeight +
                ", gear= " + gear +
                ", speed= " + speed +
                '}';
    }

}
