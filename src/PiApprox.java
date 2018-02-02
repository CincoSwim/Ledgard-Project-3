public class PiApprox {
    /*
    Written By Christopher Pucko
    Prints an approximate value of Pi, after calculating the value of Pi up to a specified point.
     */
    public static void main(String[]args){
        double aproxPi;

        aproxPi = (4.0 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));

        System.out.println("The Approximate Value of Pi is " + aproxPi);
    }
}
