package june18;

public class Manager extends Employee{

    String department;

    public Manager(int id, String name, int salary, String department) {
        super(id, name, salary);
        this.department = department;
    }
    public Manager(String department){


        this(0, null, 0, department);

    }

    public String getDetails(){
        return super.getDetails()+", "+ department;
    }
    public void getAdditionalDuties(){
        System.out.println("Manages 2 more department");
    }
}
