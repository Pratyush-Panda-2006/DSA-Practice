// Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to 
// display area of different shapes. 

abstract class Shape{
    abstract void Area();
}

class Square extends Shape{
    int s;

    Square(int s) {
        this.s = s;
    }
    
    void Area(){
        System.out.println("Area of Square is "+s*s);
    }
}
class Triangle extends Shape{
    int b,h;

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }
    
    void Area(){
        System.out.println("Area of Triangle is "+(0.5*b*h));
    }
}
class Circle extends Shape{
    int h,r;

    public Circle(int h, int r) {
        this.h = h;
        this.r = r;
    }
    
    void Area(){
        System.out.println("Area of Triangle is "+(Math.PI*r*r*h));
    }
}

class Q5{
    public static void main(String[] args) {
        Shape sa1;
        Circle c1=new Circle(2, 8);
        Square s1=new Square(5);
        Triangle t1= new Triangle(8, 5);
        sa1=c1;
        sa1.Area();
        sa1=s1;
        sa1.Area();
        sa1=t1;
        sa1.Area();

    }
}
