import java.util.*;
public class MinValueIndex {
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
    	System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int start = size / 2;   
        int min = arr[start];

        for (int i = start; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value in the second half = " + min);
    }

}
