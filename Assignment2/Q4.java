// Question-4:  
// Define a class Deposit. The instance variable of the class Deposit is mentioned below.  
// Instance Variable 
// Principal 
// Time 
// long 
// integer 
// Rate 
// Total_amt 
// double 
// double 
// Initialize the instance variables Principal, Time, rate through constructors.  
// Constructors are overloaded with the following prototypes.  
// • Constructor1: Deposit ()  
// • Constructor2: Deposit (long, int, double)  
// • Constructor3: Deposit (long, int)  
// • Constructor4: Deposit (long, double)  
// Apart from constructor, the other instance methods are  
// • display ( ): To display the value of instance variables 
// • calc_amt( ): To calculate the total amount.  
// Total_amt = Principal + (Principal×rate×Time)/100;

class Deposit{
    long Principal;
    int Time;
    Double Rate;
    static Double Total_amt;

    Deposit(){
        Principal=0;
        Time=0;
        Rate=0.0;
    }
    Deposit(long l, int t,double r){
        Principal=l;
        Time=t;
        Rate=r;
    }
    Deposit(long l, int t){
        Principal=l;
        Time=t;
        Rate=0.0;
    }
    Deposit(long l,double r){
        Principal=l;
        Time=0;
        Rate=r;
    }
    void display(){
        System.out.println("Principal "+Principal+" Time "+Time+" Rate "+Rate);
    }
    Double calc_amt(){
        Total_amt = (Principal + (Principal*Rate*Time)/100); 
        return Total_amt;

    }
}

class Q4{
    public static void main(String[] args) {
        Deposit d1=new Deposit(256485,5,8);
        d1.display();
        System.out.println("Total amount is "+d1.calc_amt());
    }
}