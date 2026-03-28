public class Q2 {
 public static void main(String[] args) {
 String[] colors = {"Red", "Blue", "Green"};
 try {
 System.out.println(colors[5]); // ArrayIndexOutOfBoundsException
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Exception: " + e);
 }
 try {
 colors[0] = null;
 System.out.println(colors[0].length()); // NullPointerException
 } catch (NullPointerException e) {
 System.out.println("Exception: " + e);
 }
 }
}
