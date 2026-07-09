class Loops
{
	public static void main(String[] args) 
	{  
		primeNum();
		power() ;
		primeRange();
		smallest ();
		secondLargestDigit();
		oddNum ();
		evenNum();
		sameDigits();
		ascendingDigits();
		highLow();
		firstNum();
		perfectNum();
		strongNum();
		ascii();
		
	}
	public static void primeNum(){
		int num = 20;
		if (num <=1)
		{
			System.out.println("this given number " + num + " is not a prime number");
			return;

		}
		for (int i = 2;i<=num/2 ; i++)
		{
			if (num%i==0)
			{
				System.out.println("this given number " + num + " is not a prime number");
				return;
				
			}
			
		}
		System.out.println("this given number " + num + " is  a prime number");
	}
	
	public static void power(){
		int base = 2;
		int power = 3;
		int res = 1;
		for (int i=1;i<=power ;i++ )
		{
			res = base * power;
		}
		System.out.println(base +" ^ "+power + " equal to " + res );
	}
	
	
	public static void primeRange() {
        int start = 1;
        int end = 20;
		System.out.println("the range of prime numbers within range of 20 ");
		for(int num = start;num<=end;num++){
			if (num<=1){
				continue;
			}
			int count = 0 ;
			if(num>2){
				for(int i =2;i<=num/2;i++){
					if(num%i==0){
						count ++;
						break;
					}
					
				}
				if(count ==0){
					  System.out.println(num);
				}
			}
		}
		
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
		    System.out.println("The smallest digit in " + original  + " is " + small);
			
	}
	
	public static void secondLargestDigit() {
         int num = 57294;
         int largest = -1;
         int secondLargest = -1;
		 int temp = num;

    while (num > 0) {
        int digit = num % 10;

        if (digit > largest) {
            secondLargest = largest;
            largest = digit;
        } 
        else if (digit > secondLargest && digit != largest) {
            secondLargest = digit;
        }

        num = num / 10;
    }

    System.out.println("Second largest digit in "+ temp +" is :" + secondLargest);
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
	public static void sameDigits() {
        int num = 7777;
        int lastDigit = num % 10;
        boolean allSame = true;

    while (num > 0) {
        int digit = num % 10;

        if (digit != lastDigit) {
            allSame = false;
            break;
        }

        num = num / 10;
    }

    if (allSame) {
        System.out.println("All digits are same");
    } else {
        System.out.println("All digits are not same");
    }
}


    public static void ascendingDigits() {
        int num = 42135;
        int[] count = new int[10];
		 System.out.println("The given digit "+ num);

    while (num > 0) {
        int digit = num % 10;
        count[digit]++;
        num = num / 10;
    }

    System.out.println("Digits in ascending order: ");
    for (int i = 0; i <= 9; i++) {
        while (count[i] > 0) {
            System.out.print(i);
            count[i]--;
        }
    }
}
	
	
	public static void highLow(){
		int num = 46837;
		int high= 0;
		int low = 9;
		int store = num;
		
		while (num!=0)
		{
			int temp = num%10;
			if (temp>high)
			{
				high = temp;
			}
			if (temp<low)
			{
				low = temp;
			}
			num /=10;
		}
		System.out.println("The largest digit in " + store + " is " + high);
		System.out.println("The smallest digit in " + store + " is " + low);
		
	}
	public static void firstNum(){
		int num = 6787;
		int temp = num;
		while (temp>=10)
		{
			temp = temp /10;
		
		}
		System.out.println("The first digit in " + num + " is " + temp);
	}
	public static void perfectNum() {
       int num = 28;
       int sum = 0;

    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum = sum + i;
        }
    }

    if (sum == num) {
        System.out.println(num + " is a perfect number");
    } else {
        System.out.println(num + " is not a perfect number");
    }
	}
	
	
	
	public static void strongNum() {
       int num = 145;
       int temp = num;
       int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }

        sum = sum + fact;
        num = num / 10;
    }

    if (sum == temp) {
        System.out.println(temp + " is a Strong Number");
    } else {
        System.out.println(temp + " is not a Strong Number");
    }
}




	public static void ascii(){
		System.out.println("Ascii values of each alphabet from A to Z");
		for (char ch ='A';ch<='Z';ch++)
		{
			System.out.println(ch+"="+(int)ch);
			
		}
		
	}
	
	}
