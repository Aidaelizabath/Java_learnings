class Atm 
{
	public static void main(String[] args) 
	{
		int balance =2000;
		int choice =3;
		int amount = 500;
		switch(choice){
			case 1:
				System.out.println("balance : " + balance);
			break;
			case 2:
				if (amount<=balance)
				{
				balance = balance - amount;
				System.out.println("withdraw is succesible");
				System.out.println("balance : " + balance);
				}
				else{
					System.out.println(" Insufficient Balance" );
				}
				break;
				case 3:
					balance = balance + amount;
				    System.out.println(" Deposit Sucessful" );
				    System.out.println("balance : " + balance);
				break;
				
				case 4:
					System.out.println("Exit");
				 break;
				 case 5:
					System.out.println("Thankyou");
				 break;
				 default:
					 System.out.println("Invalid Choice");
					 
				
		
				
		}
		
		
	}
}
