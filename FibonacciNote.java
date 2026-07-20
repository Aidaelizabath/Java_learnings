import java.util.Scanner;
public class FibonacciNote {

    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
		
	}
	public static void m1() {
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a = 0;
		int b =1;
		for(int i = 1;i<=num;i++) {
			System.out.print(a + " ");
			int c = a+b;
			a = b;
			b = c;
		}
		

	}
}
