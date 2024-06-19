package june19;

public class Airoplane implements Flyer, Vehicle{
    public void takeOff(){  //concrete method - braces are opened and closed
        System.out.println("Aeroplane taking off");
    }

    @Override
    public void land() {
        System.out.println("Aeroplane Landing");
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane flying");
    }

    @Override
    public void noOfWheels() {
        System.out.println("3 Wheels");
    }

    @Override
    public void noOfSeats() {
        System.out.println("300 Seats");
    }

    public void timeOut(){
        System.out.println("30 minutes");
    }

}
