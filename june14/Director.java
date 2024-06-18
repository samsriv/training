package june14;

public class Director extends Manager{

    int allowance;

    public Director(int id, String name, int salary, String department, int allowance) {
        super(id, name, salary, department);
        this.allowance = allowance;
    }
    public void getDepartment(){
        System.out.println("What is my department");
    }


    public String getDetails() {
        return super.getDetails() +", "+allowance;
    }
}
