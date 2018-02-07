import java.util.*;

public class SlopeLengthCalculator {
    /*
    Written by Christopher Pucko
    Outputs the numerical distance between two points after prompting an input of 2 coordinate points.
     */
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double dist;

        Scanner numInput = new Scanner(System.in);

        try {
            System.out.print("Enter x1 and y1:");

            x1 = numInput.nextDouble();
            y1 = numInput.nextDouble();

            System.out.print("Enter x2 and y2:");

            x2 = numInput.nextDouble();
            y2 = numInput.nextDouble();

            dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            System.out.println("The distance is " + (float) dist);
        } catch (InputMismatchException ex) {
            System.out.print("This input was not a number. Please try again.");
        }
    }
}
