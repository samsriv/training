public class June13Poly1 {

    // Method overloading, an example of static polymorphism.
    //method should have different type of parameters or different number of parameters
    //or different sequence of parameters
    public int add(int a, int b){
        return a+b;
    }
    public int add(byte a, byte b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args){
        June13Poly1 obj = new June13Poly1();
        System.out.println(obj.add(4, 7));

        System.out.println(obj.add(4.987, 7.33));

        System.out.println(obj.add("Hello ", "World"));

    }
}
