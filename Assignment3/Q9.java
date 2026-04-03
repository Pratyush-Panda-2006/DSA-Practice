import java.util.Scanner;
public class Q9 {
	public static double sum(double[][]m) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter elements: ");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=sc.nextDouble();
				System.out.println(m[i][j]);
			}
			System.out.println();
		}
		int s=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(i==j) {
					s+=m[i][j];
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of elements: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		double[][]arr=new double[m][n];
		System.out.println(sum(arr));
	}
}