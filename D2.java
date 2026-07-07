class  D2
{
	public static void main(String[] args) 
	{
		System.out.println("Main");
		
		System.out.println(m1(1234));
		
		System.out.println(m2(2,3));
		
		m3('a');
		
		System.out.println(m4(2,3));
		
		
		System.out.println(m5(1,2,3));
		
		
		
		
	}
	public static int m1(int a){
		return a%100;
}

   public static int m2(int b,int c){
		int area = b*c;
		int perimeter =2*(b+c);
		System.out.println("area is  "+ area);
		System.out.println("peri is  " + perimeter);
		return area + perimeter;
}
   public static char m3(char a){
		int e = (a-32);
		char y1=(char)e;
		System.out.println(y1);
		return 'a';
		
}
  public static int m4(int z,int y){
		int i = z+y;
		int j= i *i;
		return j;
}

public static int m5(int u,int v,int w){
		int o = u+v+w;
		int p = o/3;
		return p ;
		
}
  
}