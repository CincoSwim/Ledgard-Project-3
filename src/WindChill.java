import java.util.*;

public class WindChill {
    /*
    Written by Christopher Pucko
    Prints the Wind Chill Index, after temperature and wind speed are supplied.
    Temperature is in Fahrenheit, Wind Speed is in Miles per Hour
     */
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        double windSpeed;
        double temp;
        double chillIndex;
        double windExp;

        try {
            System.out.print("Enter temperature(Fahrenheit): ");
            temp = inputNum.nextDouble();

            System.out.print("Enter wind speed(mph): ");
            windSpeed = inputNum.nextDouble();

            windExp = Math.pow(windSpeed, 0.16);

            chillIndex = 35.74 + 0.6215*temp - 35.75 * windExp + 0.4275 * temp * windExp;

            System.out.println("The wind chill index is " + (int)chillIndex);


        }

        catch(InputMismatchException ex){
            System.out.println("Either the Wind Speed or Temperature you've entered were not numbers.");
            System.out.println("Please Try again later.");
        }
    }
}

