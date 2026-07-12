import java.util.Scanner;

class Sumarray
{  
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		 //M1();
		 //M2();
		 //m3();
		 //m4();
	
	
	}
	public static void m1(){
		int sum =0;
		System.out.println("Enter The Size Of Array");
		int size = sc.nextInt();
		System.out.println("Enter The Items Of Array");
		 int arr [] = new int[size];
		for(int i = 0 ;i<arr.length;i++)
		{
		  arr[i] = sc.nextInt();
		  sum = sum + arr[i];
		}
		  
		 System.out.println("the sum equals "+ sum);
		
	}
	

//write a program to replace neg num with zero.,,, array size = 6; values -5,4,-2,3,1,-1
             public static void m2(){
				 System.out.println("Enter The Size Of Array");
				 int size = sc.nextInt();
				 System.out.println("Enter The Items Of Array");
				 int arr [] = new int[size];
		         for(int i = 0 ;i<arr.length;i++)
		         {
		          arr[i] = sc.nextInt();
				  if (arr[i]<0)
				  {
					  arr[i]=0;
				  }
				   
				 
		         }
				 System.out.println("Elements of array after removing negative numbers ");
				 for (int b :arr )
				 {
					 System.out.println( b);
				 }
             }
	

// write a prgm to find num greater than the avg,arr size 5,val 10,20,30,40,50



public static void m3(){
	             int sum = 0;
				 int avg =0;
	             System.out.println("Enter The Size Of Array");
				 int size = sc.nextInt();
				 System.out.println("Enter The Items Of Array");
				 int arr [] = new int[size];
		         for(int i = 0 ;i<arr.length;i++)
		         {
		          arr[i] = sc.nextInt();
				  sum = sum + arr[i];
				  
				 }
				 avg = sum/size;
				 System.out.println("the avg of elemnets in array : " + avg);
				 System.out.println("the  elemnets in array greater than avg : ");
				 for(int i = 0 ;i<arr.length;i++)
		         {
		          if (arr[i]>avg)
		          {
					  System.out.println( arr[i]);
		          }
				  
				 }
				 
				 }
				 
				 
//write a prgm to check whether a num exists in the array, 

public static void m4(){
	             System.out.println("Enter The Size Of Array");
				 int size = sc.nextInt();
				 boolean valid = false;
				 
				  System.out.println("Enter The Value needed to be checked");
				 int value = sc.nextInt();
				 
				 System.out.println("Enter The Items Of Array");
				 int arr [] = new int[size];
		         for(int i = 0 ;i<arr.length;i++)
		         {
		          arr[i] = sc.nextInt();
				  if (arr[i] ==value)
				  {
					  valid = true;
				  }
				 }
				 if (valid)
				 {
					 System.out.println("The given value is in the array");
				 }
				 else {
					System.out.println("The given value is not the array");
				 }
}






}