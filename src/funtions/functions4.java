package funtions;
import java.util.Scanner;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class functions4 {

    static void countNumbers() {
        Scanner sc = new Scanner(System.in);

        int num;
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        displayResult(pos, neg, zero);
        sc.close();
    }

    // Function to display result
    static void displayResult(int pos, int neg, int zero) {
        System.out.println("\nCount of Positive numbers = " + pos);
        System.out.println("Count of Negative numbers = " + neg);
        System.out.println("Count of Zeros = " + zero);
    }

    public static void main(String[] args) {

        countNumbers();
    }
}
