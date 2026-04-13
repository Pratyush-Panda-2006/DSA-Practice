public class Q13 {
    public static void toBinary(int n) {
        if (n > 0) {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}