// Define a base class Employee with the following instance variables: name, salary 
// The Employee class should have: 
// • A constructor to initialize name and salary. 
// • A method displayEmployeeInfo() to display the details of the employee (i.e., name and salary). 
// Define a derived class Manager that extends the Employee class and adds an additional instance variable 
// department (a String representing the department the manager manages). 
// The Manager class should: 
// • Have a constructor that uses the super keyword to call the Employee class's constructor to initialize 
// name and salary. 
// • Include a department field, which should be initialized in the constructor. 
// • Implement a method displayManagerDetails() that calls the displayEmployeeInfo() method from the 
// Employee class (using super) to display the employee's information and also displays the department 
// of the manager.


class Employee{
    String name;
    int sal;

    Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    void displayEmployeeInfo(){
        System.out.println("Name is "+name+" salary is "+sal);
    }
}
class Manager extends Employee{
    String deptarment;

    public Manager(String deptarment, String name, int sal) {
        super(name, sal);
        this.deptarment = deptarment;
    }

    void ManagerDetails(){
        super.displayEmployeeInfo();
        System.out.println("Department is "+deptarment);
    }
}
class Q9{
    public static void main(String[] args) {
        Manager m1= new Manager("Head", "Ashutosh", 200000);
        m1.ManagerDetails();
    }
}
