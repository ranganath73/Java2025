/**
 * The printStackTrace method has the stackTrace array as an input parameter. 
 * You need to display information about each element of the array in the following format:
 * "Method <method name> was called on line <line> of the <class name> class in the file <file name>."
 * 
 * Print information about each element on a new line.
 * 
 * Example:
 * The addJuice method was called on line 24 of the Solution class in the file Solution.java.
 * 
 * Requirements:
 * •	The printStackTrace method should print information about each element in the stackTrace array.
 */

/* 
Making cocktails
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "The %s method was called on line %d of the %s class in the file %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //write your code here
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
