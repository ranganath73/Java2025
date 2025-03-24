/**
 * Make the program compile without using a try-catch block.
 *
 * Requirements:
 * •	The main method should not have a try-catch block.
 * •	The main method should throw an exception.
 * •	The main method should call the generateLuckyNumber() method.
 * •	Don't change the generateLuckyNumber method.
 */

/* 
Passing through ourselves
*/

public class Solution {

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky!");
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}
