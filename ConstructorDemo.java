public class ConstructorDemo {
    int i;  //default or freindly
    int j;
    String name;
    ConstructorDemo(){
        i = 100;
        j = 200;
        name ="STG";
    }
    // having more than one constructor is called overloading of constructor
    ConstructorDemo(int j, String name){
        this.j = j;   // this keyword refers to current class object;
        this.name = name;
    }
    ConstructorDemo(int i, int j, String name){
        this.i = i;
        this.j = j;
        this.name = name;
    }
    public static void main(String ar[]){
        ConstructorDemo constructorDemo = new ConstructorDemo(); // single line comment
       /* int newI = constructorDemo.i = 20;
        int newJ = constructorDemo.j = 39;
        String newName = constructorDemo.name = "Chennai";*/

        /*
        This is a multiline comment
        as many lines you write
         */

        /**
         * documnetation comment in java
         */

        System.out.println(constructorDemo.i+", "+constructorDemo.j+", "+constructorDemo.name);

        ConstructorDemo constructorDemo1 = new ConstructorDemo(90, "USA");

        System.out.println(constructorDemo1.i+", "+constructorDemo1.j+", "+constructorDemo1.name);

        ConstructorDemo constructorDemo2 = new ConstructorDemo(39, 24, "UK");

        System.out.println(constructorDemo2.i+", "+constructorDemo2.j+", "+constructorDemo2.name);



    }
}
