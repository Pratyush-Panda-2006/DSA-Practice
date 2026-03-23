import java.util.Scanner;

class Student {
    int roll;
    String name;
    double dsaMark;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll: ");
        roll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter DSA Mark: ");
        dsaMark = sc.nextDouble();
    }

    void showdata() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", DSA Mark: " + dsaMark);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        double maxMark = -1;
        int maxIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            s[i] = new Student();
            s[i].getdata();
            if (s[i].dsaMark > maxMark) {
                maxMark = s[i].dsaMark;
                maxIndex = i;
            }
        }

        System.out.println("\n--- Student with Highest Marks ---");
        s[maxIndex].showdata();
    }
}