package june14;

public class Manager extends Employee{
    String department;

    public Manager(int id, String name, int salary, String department) {
        super(id, name, salary);
        this.department = department;

    }
    public void getVal(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
     //   System.out.println(bonus);
    }

    //over riding method - present in sub class
    //this should have exactly the same signature as super class method.
    public String getDetails(){
        return super.getDetails() + department;
    }
    public void getAllowance(){
        System.out.println("What is my allowance");
    }
}
