import java.util.Scanner;

public class June12C {
    public static void main(String[] args){
        int[] a = new int[5]; // a[0], a[1], a[2], a[3], a[4]
        Scanner scanner = new Scanner(System.in);
/*        for(int i=0; i<5; i++){
            System.out.println("Please enter the element " +(i+1));
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
           }*/


       /* int z=0;
        while(z<5){
            System.out.println("Please enter the element " +(z+1));
            a[z] = scanner.nextInt();
            z++;
        }
        z=0;
        while(z<5){
            System.out.println(a[z]);
            z++;
        }*/

        int[] b = {22, 44, 55, 66, 22};
// for each loop used for Arrays and Collections.
        for(int i: b){
            System.out.println(i*2);
        }

        //Two D array
        int x[][] = new int[2][2];
        for(int i = 0; i<2;i++){
            for(int j = 0; j<2; j++){
                x[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i<2;i++){
            for(int j = 0; j<2; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
