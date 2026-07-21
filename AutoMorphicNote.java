import java.util.Scanner;
public interface AutoMorphicNote {
    


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		int temp = num;
		int temp1=num;
		int square = num*num;
		int count = 0;
		while(num!=0) {
			int digit = num%10 ;
			if(digit > -1) {
				count ++;
			}
			num/=10;
		}
		int divisor = 1;
		for (int i = 1; i <= count; i++) {
		    divisor *= 10;
		}
		if(temp % divisor ==temp1) {
			System.out.println("the number is automorphic");
		}
		else {
			System.out.println("the number is not automorphic");
		}

	}

}


