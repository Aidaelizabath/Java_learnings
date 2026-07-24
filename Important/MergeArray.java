import java.util.*;
public class MergeArray {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		System.out.println("Enter the size of the first array");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of the second array");
		int size2= sc.nextInt();
		System.out.println("Enter the elements of the first array");
		int arr1[] = new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
			}
		
		System.out.println("Enter the elements of the second array");
		int arr2[] = new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
			}
		int total_size = size1 + size2 ;
		int arr3[]= new int[total_size];
		
		for(int i = 0;i<size1 ;i++) {
			arr3[i]=arr1[i];
		}
		for(int i = 0;i<size2 ;i++) {
			arr3[size1 + i]=arr2[i];
		}

		
		for(int i = 0;i<total_size;i++) {
			System.out.println(arr3[i]);
		}
		
		
	}

}
