//write a prgm to print squares of num from 1-10
//write a prgm to print product of digits 234 = 2*3*4
//write a prgm to count zeroes in a number 
//write a prgm to print largest didgit in a number
//write a prgm to print individual digits of a given number


public class Program1 {

    public static void main(String[] args) {
        m1();
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
}
