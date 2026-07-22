import java.util.Scanner;

public class SpyNum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
		
	}
	public static void m1() {
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int sum =0;
		int prod = 1;
		int temp = num;
		while(num!=0) {
			int digit = num %10;
			sum = sum +digit;
			prod = prod * digit;
			num/=10;			
		}
		if(sum == prod ) {
			System.out.println("The Number is Spy");
		}
		else {
			System.out.println("The Number is not Spy");
		}
		
;	}

}

