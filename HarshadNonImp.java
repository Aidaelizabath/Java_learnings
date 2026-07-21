public class HarshadNonImp {
    import java.util.Scanner;

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int sum = 0 ;
		int temp = num;
		while(num!=0) {
			int digit = num %10;
		    sum = sum + digit;
		    num = num/10;
		}
		if(temp%sum ==0) {
			System.out.println("The Given Number is Harshad");
		}
		else {
			System.out.println("The Given Number is not Harshad");
		}

	}
}


    

