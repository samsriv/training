package june14;

public class Main {
    public static void main(String[] args){
    /*Employee employee = new Employee(1, "PETER", 99999);
    System.out.println(employee.getDetails());

    Manager manager = new Manager(2, "PARKER", 9999999, "ADMIN");
    System.out.println(manager.getDetails());*/

       // Employee employee = new Manager(1, "Peter", 199999, "Admin");

       // System.out.println(employee.getDetails());

       // employee = new Director(2,"Parker", 888888, "Admin", 7777);

        Main main = new Main();
        main.getEmpDetails(new Manager(1, "Peter", 199999, "Admin"));
        //Director director = new Employee(2, "Parker")
       // System.out.println(employee.getDetails());
    }
    public void getEmpDetails(Employee employee){

        if(employee instanceof Director){
            System.out.println("Details of Director");
            ( (Director)employee).getDepartment();
        }
        else if(employee instanceof Manager){
            System.out.println("Details of Manager");
            ((Manager) employee).getAllowance();
        }
        else {
            System.out.println("Details of Employee");
        }
        System.out.println(employee.getDetails());
    }
}
