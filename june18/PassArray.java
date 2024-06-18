package june18;

public class PassArray {
    public void getSquare(int[] a){
        for(int i: a){
            System.out.println(i*i);
        }
    }
    public static void main(String args[]){
        int a[] = {2,3,4,5,6,78,9};
        PassArray passArray = new PassArray();
        passArray.getSquare(a);
        //passArray.getSquare();

    }
}
