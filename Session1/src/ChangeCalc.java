import java.util.Scanner;

public class ChangeCalc {

    /*
     * A bank tasked you with creating a program that determines the optimal way to hand out cash.
     * The bank wants to use as few banknotes as possible.
     * The available bills are: 500, 100, 50, 10, 1
     *
     * For example, if a customer asks for 777 bucks, then the handout shall be exactly :
     * 1x500 + 2x100 + 1x50 + 2x10 + 7x1
     *
     * Assume that users always request a handout >=0 and <=1.000.000
     */

    static void main() {
        // Ask the user
        System.out.println("How much money do you want?");

        // Read the input from the user
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        // Counters
        int num500 = 0;
        int num100 = 0;
        int num50 = 0;
        int num10 = 0;
        int num1 = 0;

        // Calculations
        while (input >= 500) {
            input -= 500;
            num500++;
        }
        while (input >= 100) {
            input -= 100;
            num100++;
        }
        while (input >= 50) {
            input -= 50;
            num50++;
        }
        while (input >= 10) {
            input -= 10;
            num10++;
        }
        while (input >= 1) {
            input -= 1;
            num1++;
        }

        // Output
        System.out.println(num500 + "x500 + " + num100 + "x100 + " + num50 + "x50 + " + num10 + "x10 + " + num1 + "x1");
    }
}
