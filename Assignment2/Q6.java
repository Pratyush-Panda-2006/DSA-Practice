// Define a base class Vehicle with instance variables model and year. The instance variables are initialized 
// through constructors. The prototype of the constructor is as below: 
// Vehicle (String, int) 
// Define a derived class Car with additional instance variables carId and price. The instance variables are 
// initialized through constructors. The prototype of the constructor is as below: 
// Car (String, int, int, double) 
// Another instance method of the Car class is carDisplay () to display the information of car details. 
// Write a program to: 
// • Create an object of the Car class and initialize its values. 
// • Display both the base class (Vehicle) and derived class (Car) details using the carDisplay () method. 

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int carId;
    double price;

    Car(String model, int year, int carId, double price) {
        super(model, year); 
        this.carId = carId;
        this.price = price;
    }
    
    void carDisplay() {
        System.out.println("Model is " +model + " year is " + year);
        System.out.println("CarID is " + carId + " price is " + price);
    }
}

class Q6 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW M4", 2019, 256489, 800000.0);
        c1.carDisplay();
    }
}