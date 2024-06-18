package june17;

import june14.Employee;

public class Engineer  extends Employee {

    public Engineer(int id, String name, int salary) {
        super(id, name, salary);
    }
    public void getValue(){
        System.out.println(id);
        System.out.println(name);
    //    System.out.println(salary);
    }
}
