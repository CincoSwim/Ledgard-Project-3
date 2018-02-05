import java.util.Scanner;
import java.util.InputMismatchException;

public class Adder {
    /* Written by Christopher Pucko
       Computes the sum of a 3-digit number's digits by using Modulo division.
       i.e. An input of the number 733 would output 13 as the sum
       This also works with higher digit numbers.
     */
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int sum;
        int numInput;

        sum = 0;

        try {
            System.out.print("Enter an integer: ");
            numInput = keyin.nextInt();
            while (numInput > 0) {
                sum = sum + numInput % 10;
                numInput = numInput / 10;
            }
            System.out.println("The sum of the digits is: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("This is not a number. Please try again later.");
        }
    }
}