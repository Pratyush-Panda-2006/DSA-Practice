class Q9{
	public static int reverse(int n,int r) {
        if(n==0){
            return r;
        }
        return reverse(n/10,r*10+n%10);
    }
	public static void main(String[] args) {
		System.err.println(reverse(558,0));
	}
}

// class Q9{
// 	static void reverseDigits(int n) {
//     if (n<10) {
//         System.out.print(n);
//         return;
//     }
//     System.out.print(n % 10);
//     reverseDigits(n / 10);
// 	}
// 	public static void main(String[] args) {
// 		reverseDigits(558);
// 	}
// }
