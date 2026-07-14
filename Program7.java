import java.util.Scanner;
class  DuplicateArray
{
	public static void main(String[] args) 
	{
		
		//m1();
		m2();
	}
	public static void m1(){
		Scanner sc = new Scanner(System.in);
		boolean duplicate = false;
		System.out.println("Enter the size of your array");
		int num = sc.nextInt();
		int arr [] = new int[num];
		System.out.println("Enter the items of your array");
		for (int i =0;i<num ;i++ )
		{
			arr[i] = sc.nextInt();
		}
		for (int i =0;i<num ;i++ )
		{
			for (int j = i+1;j<num;j++ )
			{
				if (arr[i]==arr[j])
				{
					duplicate = true;
					break;
				}
			}
		}
		if (duplicate)
		{
			System.out.println("The given array contains duplicate elements");
			
		}
		else{
			System.out.println("The given array does not duplicate elements");
		}
		
		
		
		
	}
	
	
	public static void m2(){
		Scanner sc = new Scanner(System.in);
		boolean duplicate = false;
		int j=0;
		System.out.println("Enter the size of your array");
		int num = sc.nextInt();
		int arr [] = new int[num];
		int arr1 [] = new int[num];
		System.out.println("Enter the items of your array");
		for (int i =0;i<num ;i++ )
		{
			arr[i] = sc.nextInt();
		}
		for (int i =num-1;i>=0 ;i-- )
		{
			arr1[j] =arr[i];
			j++;
		}
		for (int i =num-1;i>=0 ;i-- )
		{
			System.out.println( arr[i]);
		}
		////ORRRRR
		System.out.println("Reverse array");
		for (int i = 0;i <num ;i++ ){
			System.out.println(arr1[i]);
		}
		
	}
}
