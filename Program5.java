//double type array,size 6

import java.util.Scanner;
class  Arrayyy
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size Of Array");
		int size = sc.nextInt();
		double arr[]= new double[size];
		for (int i =0;i<arr.length ;i++ )
		{
			arr[i]= sc.nextDouble();
		}
		System.out.println("The elements  in array using Print");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		System.out.println("The elements  in array using For Loop");
		for (int i =0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("The elements  in array using For Each");
		for(double dou : arr){
			System.out.println(dou);
		}
		
		
	}
}