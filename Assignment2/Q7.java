// Define a base class Shape with an instance variable color. The instance variable is initialized through the 
// constructor. The prototype of the constructor is as below: Shape (String) 
// Define two derived classes Circle and Rectangle, both inheriting from the Shape class. 
// Class Circle: 
// • Has an additional instance variable radius, initialized through the constructor. 
// • The constructor prototype is: Circle (String, double) 
// • A method area () to calculate the area of the circle: π * radius2. 
// Class Rectangle: 
// • Has two additional instance variables length and width, initialized through the constructor. 
// • The constructor prototype is: Rectangle (String, double, double) 
// • A method area () to calculate the area of the rectangle: length * width. 
// Both the Circle and Rectangle classes should have a method display () to display the shape's details, 
// including color and the area of the respective shape. 
// Write a program to: 
// 1. Create objects for both Circle and Rectangle. 
// 2. Initialize their properties. 
// 3. Display their details using the display () method. 

class Shape{
    String Color;

    public Shape(String Color) {
        this.Color = Color;
    }
}

class Circle extends Shape{
    int r;

    public Circle(String Color,int r) {
        super(Color);
        this.r =r;
    }

    void Area(){
        System.out.println("Area of Cicle is"+(Math.PI*r*r));
    }
}
class Triangle extends Shape{
    double h,b;

    public Triangle(String Color,double h, double b) {
        super(Color);
        this.h = h;
        this.b = b;
    }

    void Area(){
        System.out.println("Area of Triangle is "+(h*b));
    }
}

class Q7{
    public static void main(String[] args) {
        Circle c1=new Circle("Red", 7);
        c1.Area();
        Triangle t1=new Triangle("Blue", 9.0,10.0);
        t1.Area();
    }
}