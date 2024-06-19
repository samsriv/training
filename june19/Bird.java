package june19;

public class Bird implements Flyer{
    @Override
    public void takeOff() {
        System.out.println("Bird taking off");
    }

    @Override
    public void land() {
        System.out.println("Bird Landing");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
