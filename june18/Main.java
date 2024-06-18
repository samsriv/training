package june18;

public class Main {
    public static void main(String args[]){
        Employee employee = new Manager(1, "Peter", 99999, "Admin");
        Main main = new Main();
        main.getEmployeeDetails(employee);
    }
    void getEmployeeDetails(Employee employee){
        if(employee instanceof Manager){
           System.out.println(employee.getDetails());

           Manager manager = (Manager)employee;  //type casting

           manager.getAdditionalDuties();
        }
        else{
            employee.getDetails();
        }
    }
}
