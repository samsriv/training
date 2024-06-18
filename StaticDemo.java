public class StaticDemo {
    int i = 200;
    static int j = 100;
    final static double PI = 3.141;

    public static void main(String ar[]){
        StaticDemo s1 = new StaticDemo();
        System.out.println(s1.i +" " + s1.j);


        StaticDemo s2 = new StaticDemo();
        s1.i = 999;
        s2.j = 1000;

        System.out.println(s2.i +" " + s2.j +" "+PI);

        System.out.println("Printing s1 values again");

        System.out.println(s1.i +" " + s1.j);
        s1.j = 10000;

        System.out.println("Printing s1 values again");
        System.out.println(s1.i +" " + s1.j);

        System.out.println("Printing s2 values again");
        System.out.println(s2.i +" " + s2.j);
    }
}

// javac StaticDemo.java

//compiles the code

// java StaticDemo

// implictly it runs as StaticDemo.main(String[])