package june18;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //public Employee(){}

    public String getDetails(){
        return id+", "+name+", "+salary;
    }

    @Override
    public String toString() {
        return id+", "+name+", "+salary;
    }
}
