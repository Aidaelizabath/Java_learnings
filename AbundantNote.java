import java.util.Scanner;
public class AbundantNote {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		int sum =0;
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		for(int i =1;i<num1;i++) {
			if(num1%i ==0) {
				sum += i;

			}
		}
		if (sum > num1) {
            System.out.println("The number is Abundant");
        } else if(sum<num1)  {
            System.out.println("The number is Deficient");
        }
        else {
        	System.out.println("The number is Perfect");
        }
		
	}

}
