/**
 * The Solution class has three fields with identical values: 
 * In the main method, they are compared and the results of the 
 * comparisons are displayed on the console.
 * Add the minimum number of calls to the equals() method in the main method, 
 * so that the output is:
 * true
 * true
 * true
 *
 * Requirements:
 * •	Do not change the fields of the Solution class.
 * •	The output must match the task conditions.
 * •	Add the minimum number of calls to the equals() method.
 */


/* 
Comparing numbers
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
