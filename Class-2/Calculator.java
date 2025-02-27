/**
 * Program name: Operators
 * 
 *      Compiler: 
 *          * javac
 *          * javadoc
 *          * javap
 */

 /*
 nextInt()
 nextDouble()
 next()
 nextLine();
 */

// Arithmetic Operators   | Single-line comment

        // +
        // -
        // *
        // /
        // %

        // +=
        // -=
        // *=
        // /=
        // %=
 
// const

// StringBuffer
// StringBuilder

final int ARRAY_SIZE = 100;

/*        {
            int a = 0; // local variable
            a++;  // a = a + 1;  => 0 + 1
            ++a;
            --a;

            a += 10; // a = a + 10;  // 11

       }
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt(); // 
        int number2 = scan.nextInt();

        String operator = scan.next();

        int result;
        
        
        if (operator.equalsIgnoreCase("aDd")) {
            System.out.println((number1 + number2));
        }  else if (operator.equals("sub")) {
            System.out.println((number1 - number2));
        } else if (operator.equals("mul")) {
            System.out.println((number1 * number2));
        } else if (operator.equals("div")) {
            System.out.println((number1 / number2));
        }  else if (operator.equals("mod")) {
            System.out.println((number1 % number2));
        }        
    }
}
