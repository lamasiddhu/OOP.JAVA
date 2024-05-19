import java.util.Scanner;
/* */


public class InputOutput{
    public static void main(String[] args) {
       /*user output */
       System.out.println( "This sentence will have line break");
       /*system.out.print */
       System.out.print("This will not have break");
       System.out.print("This line will continue. \n");
       /*String formatting using system.out.printf
        * %s String , %d Integral, %f floating point, %b boolean
        * This will also not break
        */
        System.out.printf("Hello %s, good morning","world");
        System.out.printf("The number is %d", 10);
        /*can use multiple formatter */
        System.out.print("\nThe folating %f and boolean %b",10.3f, false);

     
        /*User Input
         * Import java.uril.Scanner:// copy this line at the top of the code
         */
        Scanner scan = new Scanner(System.in);
        System.out.println ("The following take whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input take is " + wholeOutput);
        System.out.println("The following takes integer");
        int intInput = scan.nextInt();
        System.out.print("The input taken is" + intInput );
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is" + doubleInput);
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input taken is" + booleanInput);
        scan.close(); // you must close the scanner once all input is taken

        /*Task
         * Make a new scanner object scan1
         * prompt the following and take input
         * what is your name? save the input to string -> name
         * Are you over 18? save the input tpo boolean -> status
         * How many siblings?save the input to integer -> sibling
         * print thge following
         * Hellow name ,
         * Over 18? status
         * You have sibling number of sibling
         */

    }
} 