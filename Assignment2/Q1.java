// Question-1:  
// Define a class Car with two instance variables: model and year 
// Two member methods are: 
// • setDetails(): Set the details of the car. 
// • displayDetails(): Display the details of the car. 
// Now, create two objects of the Car class: 
// • Initialize the first object's values directly (by using the dot. operator) with model: "Toyota" and year: 
// 2020. 
// • Accept the model and year through the keyboard input and set them to another object using the 
// setDetails() method. 
// Now, display the details of both cars using the displayDetails() method.  
// Also, check which car is newer. 

import java.util.Scanner;
class Car{
    String model;
    int year;
    
    void setDetails(String model,int year){
        this.model=model;
        this.year=year;
    }

    void displayDetails(){
        System.out.println("Model of the car is "+model+" and year is "+year);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        Car c2=new Car();

        System.out.println("Enter car model and year");
        String m=sc.nextLine();
        int y=sc.nextInt();
        sc.close();

        c1.setDetails("Toyota",2020);
        c2.setDetails(m,y);
        c1.displayDetails();
        c2.displayDetails();

        if(c1.year>c2.year){
            System.out.println(c1.model+" is newer than "+c2.model); 
        }else if(c1.year<c2.year){
            System.out.println(c2.model+" is newer than "+c1.model); 
        }else{
            System.out.println("Both are of same year"); 
        }

    }
}