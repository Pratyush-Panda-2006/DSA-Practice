class Q9{
	static void reverseDigits(int n) {
    if (n<10) {
        System.out.print(n);
        return;
    }
    System.out.print(n % 10);
    reverseDigits(n / 10);
	}
	public static void main(String[] args) {
		reverseDigits(558);
	}
}
