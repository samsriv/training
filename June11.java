public class June11 {
    int j; // automatic initilization
    public static void main(String[] ar){
        char ch = 'w';
        String  str = "ABCDEFG";
        int i = 100; //have to be initilized explictly
      //  System.out.println(i);  // wrong statement
        System.out.println(new June11().j);

        int z = 100;
        System.out.println(z++);  //post incriment
        System.out.println(++z); //preincrement
         z += 5; // z = z+5;
        System.out.println(z--);

       if(z == i){
           System.out.println("Z is same as i");
       }else {
           System.out.println("z is not same as i");
       }

    }
}
