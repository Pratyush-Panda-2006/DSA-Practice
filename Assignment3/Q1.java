import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your lucky number: ");
            int num = Integer.parseInt(sc.nextLine());
        if (num < 0) {
            throw new NumberFormatException("Negative number entered.");
        }
        System.out.println("Your lucky number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
