import java.util.Scanner;

public class MagicNumNote {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
		
	}
	public static void m1() {
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int sum = num;
		while (sum > 9) {

	        int temp = sum;
	        sum = 0;
		while(temp!=0) {
			int rev = temp%10;
			sum +=rev;
			temp/=10;
			
		}
		}
		
		if(sum==1) {
			System.out.println("the number is magic");
		}
		else {
			System.out.println("the number is not magic");
		}
		
	}
 
}
