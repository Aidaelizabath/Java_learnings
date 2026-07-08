class Program4{
public static void main(String[] args){
    m1(10,20,30,40,50);

}
public static void m1(int ...a){
    int Sum =0 ;
    for(int i =0;i<a.length;i++){
         Sum = Sum +  a[i];
    }
    System.out.println("Sum of the given numbers are " + Sum);
}
}