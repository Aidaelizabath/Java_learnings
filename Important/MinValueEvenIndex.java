import java.util.Scanner;

public class MinValueEvenIndex {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		
		
		System.out.println("enter the size of your array");
		int size = sc.nextInt();
		System.out.println("enter the elements of  array");
		int arr1[]= new int[size];
		for(int i =0;i<size;i++) {
			arr1[i] = sc.nextInt();
			}
		int min = arr1[0];
		for(int i =0;i<size;i+=2) {
			if(arr1[i]<min) {
				min = arr1[i];
			}
		}
        System.out.println("Minimum value at even index = " + min);

		
	}

}
