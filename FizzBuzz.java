import java.util.Scanner;

public class FizzBuzz {
	 static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
		m1();
	}
     public static void m1() {
		System.out.println("enter the num");
		int num = sc.nextInt();
		if(num% 5 ==0 && num%3 ==0) {
			System.out.println("The number is FizzBuzz");
		}
		else if (num% 5 ==0 && num%3 !=0) {
			System.out.println("The number is Fizz");
		}
		else if (num% 5 !=0 && num%3 ==0) {
			System.out.println("The number is Buzz");
		}
		else {
			System.out.println("the number is not fizzbuzz or fizz or buzz");
		}


	}
}
