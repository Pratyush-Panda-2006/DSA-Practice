class Q8 {
    public static double power(double x, int n) {
        if (n==0) {
            return 1;
        }
        return x *power(x, n-1);
    }
    public static void main(String[] args) {
        power(5.0,5);
    }
}