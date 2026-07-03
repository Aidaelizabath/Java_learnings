


public class Program1 {

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();

    }

    public static void m1(){
        int num = 1;
        System.out.println("Squares of numbers from 1 to 10 are: ");
        do{
            int square = num*num;
            System.out.println(square);
            num ++ ;
        }while(num <=10);
    }

    public static void m2(){
        int num = 234;
        int product = 1;
        System.out.println("Product of digits in  " + num);
        do{
            int rev = num %10;
            product = product * rev;
            num /=10;
        }while(num!=0);
        System.out.println(product);
    }

    public static void m3(){
        int num = 1002003;
        int count = 0;
        System.out.println("Count of zeroes in " + num);
        do{
            int rev = num %10;
            if(rev == 0){
                count++;
            }
            num /=10;
        }while(num!=0);
        System.out.println(count);
    }
    public static void m4(){
        int num = 234567;
        int largest = 0;
        System.out.println("Largest digit in " + num);
        do{
            int rev = num %10;
            if(rev > largest){
                largest = rev;
            }
            num /=10;
        }while(num!=0);
        System.out.println(largest);
    }
    public static void m5(){
        int num = 533278;
        int temp = 0;
        int store =0;
        System.out.println("The digits in number " + num + " in  order are: ");
        do{
            int rev = num %10;
            temp = temp*10 +rev;
            num /=10;
            

        }while(num!=0);
        do{
            int rever = temp%10;
            System.out.println(rever);
            temp/=10;
            

        }while(temp!=0);
        
    }

}
