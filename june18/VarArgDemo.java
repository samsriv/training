package june18;

public class VarArgDemo {

    public void getSquare(int... a){
        for(int i: a){
            System.out.println(i*i);
        }
    }
    /*public void getSquare(int... a, String str){
        for(int i: a){
            System.out.println(i*i);
        }
    }
    public void getSquare(String str, int... a ){
        for(int i: a){
            System.out.println(i*i);
        }
    }*/
    public static void main(String... args){

        VarArgDemo varArgDemo = new VarArgDemo();
        varArgDemo.getSquare(1, 2, 3);

        varArgDemo.getSquare(9);

        varArgDemo.getSquare();
    }
}
