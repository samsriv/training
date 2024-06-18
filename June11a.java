public class June11a {
    public static void main(String args[]){
        int marks  = 75;
        if(marks>80){
            System.out.println("A+");
        } else if (marks >70) {
            System.out.println("A");

             } else if (marks>60) {
            System.out.println("B");
        }else {
            System.out.println("Try again");
        }

        /// example of ternary operator
        System.out.println(marks>80?"Good Job" : "Try Again");
    }
}
