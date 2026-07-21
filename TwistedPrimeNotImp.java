class TwistedPrimeNotImp {
    import java.util.Scanner;


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		boolean flag = true;
		boolean valid = true;
		int rev =0;
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		while(num !=0) {
			int digit = num%10;
			rev = rev *10 + digit;
			num =num/10;
		}
		for(int i =2;i<temp/2;i++) {
			if (temp%i ==0) {
				flag = false;
				break;
			}
		}
		for(int i =2;i<rev/2;i++) {
			if (rev%i ==0) {
			valid = false;
			break;
			}
		}
		if(valid && flag) {
			System.out.println("The given Number Is Twisted Prime");
		}
		else {
			System.out.println("The given Number Is Not Twisted Prime");
		}
	}
 
}


