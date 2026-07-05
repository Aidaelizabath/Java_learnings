class Program2
{
	public static void main(String[] args) 
	{
		smallest ();
		oddNum();
		evenNum();
	}
	
	public static void smallest(){
		int temp =0;
		int num =894;
		int small =num%10;
		int original = num;
		while(num!=0){
			temp = num % 10;
			if (temp < small)
			{
				small = temp;
			}
			num /=10;	
		}
		    System.out.println(" the smallest digit in " + original  + " is " + small);
			
	}
	public static void oddNum(){
		int num = 123467;
		int count =0;
		int temp = num;
		while (num!=0)
		{
			int rev = num%10;
			if (rev%2!=0)
		{
			count++;
		}
		   num/=10;
		}
		
		System.out.println("The count of odd digits in " +temp+ " is " + count);
		
	}
	
	public static void evenNum(){
		int num = 45723;
		int count =0;
		int temp = num;
		while (num!=0)
		{
			int rev = num%10;
			if (rev%2==0)
		{
			count++;
		}
		   num/=10;
		}
		
		System.out.println("The count of even digits in " +temp+ " is " + count);
		
	}
	
	
	}