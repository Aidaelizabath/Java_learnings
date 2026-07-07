import java.util.Scanner;

class Array1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Size ");
		int size = sc.nextInt();
		
		String arr [] = new String[size];
        System.out.println(" Enter the Items ");
		for (int i =0;i<=size-1 ;i++ )
		{
			arr[i]= sc.next();
		}
		
		
		
	}
}
