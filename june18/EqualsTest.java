package june18;

public class EqualsTest {
    public static void main(String args[]){
        String str1 = new String("STG");
        String str2 = new String("STG");

        // == operator checks if the references points the same object
        System.out.println(str1 == str2);

        //equals() method checks the contents of the object
        System.out.println(str1.equals(str2));

        String str3 = "Chennai";
        String str4 = "Chennai";

        System.out.println(str3 == str4);

        System.out.println(str3.equals(str4));
    }
}
