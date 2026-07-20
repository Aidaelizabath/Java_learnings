import java.util.Scanner;

public class TwinPrime {
	static Scanner sc = new Scanner (System.in);
	
public static void main(String[] args) {
	m1();
	
}
public static void m1() {
	boolean flag = true;
	boolean difference= false;
	System.out.println("Enter the first number");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number");
	int num2= sc.nextInt();
	if (num2 - num1 ==2 || num1 - num2 ==2) {
		difference= true;
	}
	for(int i =2;i<=num1/2;i++) {
		if(num1%i ==0) {
			flag =false;
			break;
		}
	}
	for(int j =2;j<=num2/2;j++) {
		if(num2%j ==0) {
			flag = false;
			break;
		}
	}
	if(flag&& difference) {
		System.out.println("the given numbers are Twin prime");
	}
	else {
		System.out.println("the given numbers are not Twin prime");
	}
	

}
	

}
