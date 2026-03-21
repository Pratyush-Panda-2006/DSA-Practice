// Question-8: 
// Define two interfaces, Flyable and Swimmable, with the following methods: 
// Interface Flyable: 
// • A method fly () (e.g., "Flying not flying"). 
// Interface Swimmable: 
// • A method swim () (e.g., "Swimming or not swimming"). 
// Define a class Duck that implements both Flyable and Swimmable interfaces. This class should: 
// • Implement the fly () method from Flyable interface. 
// • Implement the swim () method from Swimmable interface. 
// • Include an additional instance variable name (a String) to store the name of the duck, initialized 
// through the constructor. 
// • A displayDetails() method to display the duck's name and its capabilities (whether it can fly or 
// swim). 
// Write a program to: 
// • Create an object of Duck and initialize its name. 
// • Call the fly() and swim() methods using the Duck object. 
// • Display the duck's name and its abilities using the displayDetails() method.


interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    String name; 
    Duck(String n) {
        name = n;
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    void displayDetails() {
        System.out.println("Duck Name: " + name);
        System.out.println("Abilities: Can fly and swim.");
    }
}
public class Q8 {
    public static void main(String[] args) {
        
        Duck myDuck = new Duck("Donald");
        myDuck.fly();
        myDuck.swim();
        myDuck.displayDetails();
    }
}