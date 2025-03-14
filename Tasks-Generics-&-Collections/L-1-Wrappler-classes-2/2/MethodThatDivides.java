/**
 * Implement the divide(double a, double b) method so that the console 
 * shows the result of dividing the number a by the number b.
 * 
 * The following value should be displayed:
 * Double.POSITIVE_INFINITY, if any of the following is true:
a is positive and b is equal to 0;
a is equal to Double.POSITIVE_INFINITY and b >= 0 and b is not equal to Double.POSITIVE_INFINITY;
a is equal to Double.NEGATIVE_INFINITY and b < 0 and b is not equal to Double.NEGATIVE_INFINITY;
Double.NEGATIVE_INFINITY, if any of the following is true:
a is negative and b is equal to 0;
a is equal to Double.NEGATIVE_INFINITY and b >= 0 and b is not equal to Double.POSITIVE_INFINITY;
a is equal to Double.POSITIVE_INFINITY and b < 0 and b is not equal to Double.NEGATIVE_INFINITY;
Double.NaN, if any of the following is true:
a is equal to 0 and b is equal to 0;
at least one of the operands is Double.NaN;
a is equal to Double.POSITIVE_INFINITY and b is equal to Double.POSITIVE_INFINITY;
a is equal to Double.POSITIVE_INFINITY and b is equal to Double.NEGATIVE_INFINITY;
a is equal to Double.NEGATIVE_INFINITY and b is equal to Double.POSITIVE_INFINITY;
a is equal to Double.NEGATIVE_INFINITY and b is equal to Double.NEGATIVE_INFINITY;
In all other cases, display the result of dividing a by b.
Requirements:
•	The divide(double a, double b) method should display the result of dividing the number a by the number b.
•	The divide(double a, double b) method should display "Infinity" in accordance with the item 1 of the task conditions.
•	The divide(double a, double b) method should display "-Infinity" in accordance with item 2 of the task conditions.
•	The divide(double a, double b) method should display "NaN" in accordance with item 3 of the task conditions.

 */


/* 
A method that divides
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //write your code here
    }
}
