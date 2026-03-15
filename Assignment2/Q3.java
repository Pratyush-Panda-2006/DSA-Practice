
import java.util.Scanner;

// Define a class named Book with the following member variables: 
// • bookId (an integer representing the unique ID of the book) 
// • price (a double representing the price of the book) 
// • quantity (an integer representing the quantity of books purchased) 
// Additionally, include a static variable totalAmount to keep track of the total amount spent on all books. 
// The class should have: 
// • A parameterized constructor to initialize the bookId, price, and quantity. Note: Use “this”. 
// • A displayDetails() method to print the details of the book (i.e., bookId, price, quantity). 
// • A method to calculate and return the total cost for that book (price * quantity). 
// • Update the static variable totalAmount to include the total cost of the book purchased. 
// Now, write a separate Main class to simulate the purchasing of 5 different books. Display the details of each 
// book, and finally, display the total amount spent on the purchase of all books. 


class Book{
    int bookId, quantity;
    double price;
    static int totalAmount=0;

    Book(int bookId, double price, int quantity){
        this.bookId=bookId;
        this.price=price;
        this.quantity=quantity;
        totalAmount+=totalCost(price, quantity);
    }

    void displayDetails(){
        System.out.println("Bookid is "+bookId+" price is "+price+" quantity is "+quantity);
    } 

    int totalCost(double price,int quantity){
        return (int) price*quantity;
    }
}
class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book[] b3=new Book[3];

        for (int i=0;i<b3.length;i++){
            System.out.println("Enter value for "+(i+1)+" no of book");
            int b=sc.nextInt();
            double p=sc.nextDouble();
            int q=sc.nextInt();
            b3[i]=new Book(b, p, q);
        }

        for (int j=0;j<b3.length;j++){
            b3[j].displayDetails();
        }

        int s=0;
        for (int k=0;k<b3.length;k++){
            s=s+b3[k].totalAmount;
        }
        System.out.println("total is "+s);
    }
}