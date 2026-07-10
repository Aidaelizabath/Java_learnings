class MethodAccept
{
	public static void main(String[] args) 
	{
		char ar[] = {'A','B','C','D'};
		acceptArray (ar);
	}
	
	public static void acceptArray(char arr2[]){
		for(char a:arr2){
			System.out.println(a);
		}
		System.out.println(arr2);
	}
}
