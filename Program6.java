/* QUESTION:6 ; CREATE AN ELEC BILL CALC WITH FOLLO MENU
 ENTER CONS DETAILS like  NAME, his ID , and the UNIT CONSUMED
then CALC BILL, DISPLAY BILL, EXIT
CONDitions to follow while calculating bill
0-100 UNIT RS 2 PER UNIT
101-200 RS 3 PER UNIT
201-300 RS RS 5 PER UNIT
ABOVE 300 RS 7 PER UNIT
IF UNIT<0 DISPLAY INVALID UNIT
*/
import java.util.Scanner;

public class ElectricityBill {
	static Scanner sc = new Scanner(System.in);
  
    static String name = "";
    static int id = 0;
    static int unit = 0;
    static double bill = 0;
	static boolean detailof= false;

    public static void main(String[] args) {
        
        int choice;
		

        do {
            System.out.println("1. Enter Details");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Enter the  choice: ");
            choice = sc.nextInt();
            sc.nextLine();   

            switch (choice) {
                case 1:
                    enterDetails();
                    break;

                case 2:
                if (detailof == false) {
                    System.out.println("Please enter  details first");
                    } else {
                    calculateBill();
                    }
                    break;

                case 3:
                    displayBill();
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid");
            }

        } while (choice != 4);

        
    }

    public static void enterDetails() {
        System.out.print("Enter Consumer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Consumer ID: ");
        id = sc.nextInt();

        System.out.print("Enter Unit Consumed: ");
        unit = sc.nextInt();
        sc.nextLine();  
		detailof= true;
    }

    public static void calculateBill() {
        if (unit < 0) {
            System.out.println("Invalid Unit");
            bill = 0;
        } 
        else if (unit <= 100) {
            bill = unit * 2;
        } 
        else if (unit <= 200) {
            bill = unit * 3;
        } 
        else if (unit <= 300) {
            bill = unit * 5;
        } 
        else {
            bill = unit * 7;
        }

        if (unit >= 0) {
            System.out.println("Your Bill is calculated .");
        }
    }

    public static void displayBill() {
        if (unit < 0) {
            System.out.println("Invalid Unit.");
        } 
        else {
           
            System.out.println("Consumer Name   : " + name);
            System.out.println("Consumer ID     : " + id);
            System.out.println("Units Consumed  : " + unit);
            System.out.println("Bill Amount     : Rs. " + bill);
        }
    }
}