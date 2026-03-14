// Question-2:  
// Define a class called Complex with instance variables real, imag and instance methods 
// • void setData () 
// • void display () 
// • public Complex add (Complex, Complex)  
// Write the main method in a separate class to implement the addition of two complex number with the given 
// method signature as above. 

class Complex{
    int real,imag;
    void setData (int real, int imag){
        this.real=real;
        this.imag=imag;
    }

    void display (){
        System.out.println("Real number is "+real+" imag number is "+imag);
    }

    public Complex add (Complex c1, Complex c2) {
        Complex c3= new Complex();
        c3.real=c1.real+c2.real;
        c3.imag=c1.imag+c2.imag;
        return c3;
    }
}
class Q2{
    public static void main(String[] args) {
        Complex c1= new Complex();
        c1.setData(2,4);
        Complex c2= new Complex();
        c2.setData(6,8);
        Complex c3= new Complex();
        c3=c3.add(c1,c2);

        c1.display();
        c2.display();
        c3.display();
    }
}