//custom class;
class Employee {

    // the access modifier private is used so we have to use getter and setter to
    // get and set the value;
    private String name;
    private int Salary;

    // setter functoion;
    public String setName(String n) {
        return name = n;
    }

    public int setSalary(int sal) {
        return Salary = sal;
    }

    // getter function;
    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }
}

public class getteAndsetter {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Harsh");
        emp1.setSalary(20000);

        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
