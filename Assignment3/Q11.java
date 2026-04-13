public class Q11 {
    public static int gcd(int m, int n) {
        if (n==0){
            return m;
        } 
        return gcd(n, m % n);
    }
    public static void main(String[] args) {
        gcd(10, 20);
    }
}