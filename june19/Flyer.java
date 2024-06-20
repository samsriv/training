package june19;

public interface Flyer {
    void takeOff();  //abstract method
    //methods which are only declared and not defined
    void land();

    //added for backward compatability in java8
    default void timeOut(){
        getValue();
    }

    //added in java 8
    static void takeRest(){
        System.out.println("Take rest for 2 days");
    }

    //private method added in interface in java9
    private void getValue(){
        System.out.println("1 hour");
    }
    void fly();
    int TIME = 10;
}
