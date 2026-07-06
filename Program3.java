import java.util.Scanner;

class Program3
{
	public static void main(String[] args) 
	{
		
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value ");
		byte bytee = sc.nextByte();
		System.out.println("the value is  " + bytee);
		
		System.out.println("Enter a value ");
		short shorte = sc.nextShort();
		System.out.println("the value is  " + shorte);
		
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		System.out.println("the age of the user is " +age);
		
		System.out.println("Enter a value ");
		long longe = sc.nextLong();
		System.out.println("the value is  " + longe);
		
		
		System.out.println("Enter a value ");
		float flo = sc.nextFloat();
		System.out.println("the value is  " + flo);
		
		System.out.println("Enter Your First name");
		String name = sc.next();
		System.out.println("the name of the user is " +name);
		
		
	    System.out.println("Enter Your name");
		sc.nextLine();            // consumes the leftover Enter key
		String fullname = sc.nextLine();   // now takes the actual full name
		System.out.println("the name of the user is " + fullname);
		
		
		System.out.println("Enter a word ");
		char character = sc.next().charAt(1);
		System.out.println("the character  is " + character);
		
		
	
		

		
			
		
	}
}
 
