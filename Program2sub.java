import java.util.Scanner;

class Loops1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        primeNum();
        power();
        primeRange();
        smallest();
        secondLargestDigit();
        oddNum();
        evenNum();
        sameDigits();
        ascendingDigits();
        highLow();
        firstNum();
        perfectNum();
        strongNum();
        ascii();
    }

    // Write a Java program to check whether a given number is prime or not
    public static void primeNum() {
        System.out.println("Enter a number to check prime:");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("The given number " + num + " is not a prime number");
            return;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("The given number " + num + " is not a prime number");
                return;
            }
        }

        System.out.println("The given number " + num + " is a prime number");
    }

    // Write a Java program to find the power of a number
    public static void power() {
        System.out.println("Enter base:");
        int base = sc.nextInt();

        System.out.println("Enter power:");
        int power = sc.nextInt();

        int res = 1;

        for (int i = 1; i <= power; i++) {
            res = res * base;
        }

        System.out.println(base + " ^ " + power + " = " + res);
    }

    // Write a Java program to print all prime numbers in a given range
    public static void primeRange() {
        System.out.println("Enter starting range:");
        int start = sc.nextInt();

        System.out.println("Enter ending range:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int count = 0;

            if (num <= 1) {
                continue;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(num);
            }
        }
    }

    // Write a Java program to find the smallest digit in a given number
    public static void smallest() {
        System.out.println("Enter a number to find smallest digit:");
        int num = sc.nextInt();

        int temp = 0;
        int small = num % 10;
        int original = num;

        while (num != 0) {
            temp = num % 10;
            if (temp < small) {
                small = temp;
            }
            num /= 10;
        }

        System.out.println("The smallest digit in " + original + " is " + small);
    }

    // Write a Java program to find the second largest digit in a given number
    public static void secondLargestDigit() {
        System.out.println("Enter a number to find second largest digit:");
        int num = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num = num / 10;
        }

        System.out.println("Second largest digit in " + temp + " is: " + secondLargest);
    }

    // Write a Java program to count the number of odd digits in a given number
    public static void oddNum() {
        System.out.println("Enter a number to count odd digits:");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (num != 0) {
            int rev = num % 10;
            if (rev % 2 != 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println("The count of odd digits in " + temp + " is " + count);
    }

    // Write a Java program to count the number of even digits in a given number
    public static void evenNum() {
        System.out.println("Enter a number to count even digits:");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (num != 0) {
            int rev = num % 10;
            if (rev % 2 == 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println("The count of even digits in " + temp + " is " + count);
    }

    // Write a Java program to check whether all digits in a given number are the same
    public static void sameDigits() {
        System.out.println("Enter a number to check whether all digits are same:");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        boolean allSame = true;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;

            if (digit != lastDigit) {
                allSame = false;
                break;
            }

            num = num / 10;
        }

        if (allSame) {
            System.out.println("All digits in " + temp + " are same");
        } else {
            System.out.println("All digits in " + temp + " are not same");
        }
    }

    // Write a Java program to arrange the digits of a given number in ascending order
    public static void ascendingDigits() {
        System.out.println("Enter a number to arrange digits in ascending order:");
        int num = sc.nextInt();

        int original = num;
        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }

        System.out.print("Digits of " + original + " in ascending order: ");
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                System.out.print(i);
                count[i]--;
            }
        }
        System.out.println();
    }

    // Write a Java program to find the largest digit and smallest digit in a given number
    public static void highLow() {
        System.out.println("Enter a number to find highest and lowest digit:");
        int num = sc.nextInt();

        int high = 0;
        int low = 9;
        int store = num;

        while (num != 0) {
            int temp = num % 10;
            if (temp > high) {
                high = temp;
            }
            if (temp < low) {
                low = temp;
            }
            num /= 10;
        }

        System.out.println("The largest digit in " + store + " is " + high);
        System.out.println("The smallest digit in " + store + " is " + low);
    }

    // Write a Java program to find the first digit in a given number
    public static void firstNum() {
        System.out.println("Enter a number to find first digit:");
        int num = sc.nextInt();

        int temp = num;
        while (temp >= 10) {
            temp = temp / 10;
        }

        System.out.println("The first digit in " + num + " is " + temp);
    }

    // Write a Java program to check whether a given number is a perfect number or not
    public static void perfectNum() {
        System.out.println("Enter a number to check perfect number:");
        int num = sc.nextInt();

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

    // Write a Java program to check whether a given number is a strong number or not
    public static void strongNum() {
        System.out.println("Enter a number to check strong number:");
        int num = sc.nextInt();

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

    // Write a Java program to print ASCII values of alphabets from A to Z
    public static void ascii() {
        System.out.println("ASCII values of each alphabet from A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}