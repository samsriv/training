package june14;

public class Employee {
    protected int id;
    protected String name;
    int salary;
    private int bonus;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // over ridden method - in super class
    public String getDetails(){
        return id+", "+name+", "+salary;
    }
}
