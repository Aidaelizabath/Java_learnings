

public class StaticMethod {
        public static void main(String[] args) {
        	System.out.println("From the main method");
        	m1();
        	System.out.println(m2(100,50));
			
		}
        public static  void m1() {
			// TODO Auto-generated method stub
            System.out.println("From method m1");
		}
        public static int m2(int a,int b) {
			// TODO Auto-generated method stub
        	return a  - b ;

		}
        
}
