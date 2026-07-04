class Program2
{
	public static void main(String[] args) 
	{
		smallest ();
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
	}