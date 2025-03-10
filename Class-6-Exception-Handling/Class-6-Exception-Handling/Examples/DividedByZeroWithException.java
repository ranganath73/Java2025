// ArithmeticException and InputMismatchException
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedByZeroWithException
{
    // throws an exception when divided by zero
    public static int quotient(int numerator, int denominator) throws ArithmeticException
    {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
            
            } catch(InputMismatchException inputMismatchException) {
                System.out.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine(); // discard the input so user can try again
                System.out.printf("You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }

        } while(continueLoop);
    }
}