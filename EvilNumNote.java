import java.util.Scanner;

public class EvilNumNote {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int temp = num;
		int count =0;
		while(temp!=0) {
			if(temp%2==1) {
				count++;
			}
			temp = temp/2;
		}
		if(count%2==0) {
			System.out.println("The Number is Evil");
		}
		else {
			System.out.println("The Number is not Evil");
		}
		
		

	}
    
}
