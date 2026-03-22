class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int eid;
    double salary;

    Employee(String name, int age, int eid, double salary) {
        super(name, age); 
        this.eid = eid;
        this.salary = salary;
    }

    void empDisplay() {
        System.out.println("Name: " + name + ", Age: " + age + ", EID: " + eid + ", Salary: " + salary);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 101, 50000.0);
        emp.empDisplay();
    }
}