/**
 * Catch the exception in the main method so that the program compiles.
 * When an exception occurs, display the errorMessage string.
 *
 * Requirements:
 * •	You need to add a try-catch block in the main method.
 * •	The main method must not throw checked exceptions.
 * •	The main method should call the generateLuckyNumber method.
 * •	Don't change the generateLuckyNumber method.
 * •	When an exception occurs in the main method, 
 *      you need to display the errorMessage string on the screen.
 */

/* 
Swallowing an exception
*/

public class Solution {

    public static String errorMessage = "Unlucky!";

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}