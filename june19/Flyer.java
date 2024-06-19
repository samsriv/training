package june19;

public interface Flyer {
    void takeOff();  //abstract method
    //methods which are only declared and not defined
    void land();

    default void timeOut(){
        System.out.println("1 hour");
    }
    void fly();
    int TIME = 10;
}
