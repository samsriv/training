package june19;

public class Main {
    public static void main(String args[]){
        Flyer flyer = new Airoplane() ;

        flyer.takeOff();

        flyer.fly();
        flyer.land();
        flyer.timeOut();
        System.out.println(Flyer.TIME);

        Airoplane airoplane = (Airoplane)flyer;  // Type casting
        airoplane.noOfWheels();
        airoplane.noOfSeats();

        flyer = new Bird();

        flyer.takeOff();

        flyer.fly();
        flyer.land();
        flyer.timeOut();
    }
}
