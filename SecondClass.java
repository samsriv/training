import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args){

        // Declaring the employee object
        Employee employee = new Employee();
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpName());


        Employee employee1 = employee;

        System.out.println(employee1.getEmpId());
        System.out.println(employee1.getEmpName());

        employee1 = new Employee();
        employee1.setEmpId(30); // = 30;
        employee1.setEmpName("FDB"); //= "FDG";



    }
}


