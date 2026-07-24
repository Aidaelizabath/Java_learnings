import java.util.Scanner;

public class ArrayEqual {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        m1();
    }

    public static void m1() {

        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();

        System.out.println("Enter the size of the second array");
        int size2 = sc.nextInt();

        if (size1 != size2) {
            System.out.println("Arrays are not equal");
            return;
        }

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean equal = true;

        for (int i = 0; i < size1; i++) {
            if (arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}