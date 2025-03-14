/**
 * The compare(Character, Character) 
 * method takes two characters and displays the result of comparing them.
 * Implement the compare(Character, Character) method, which should compare the characters correctly.
 * If the code of the first character is greater than that of the second, print "greater than".
 * If the code of the first character is less than that of the second, print "less than".
 * If the code of the first character is equal to that of the second, print "equal".
 *
 * Requirements:
 * •	Fix the compare(Character, Character) method by changing one condition.
 */

/* 
Comparing symbols
*/

public class Solution {

    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'b');
        compare('r', 'c');
        compare('z', 'z');
    }

    public static void compare(Character first, Character second) {
        if (first == second) {
            System.out.println("equal");
        } else if (first > second) {
            System.out.println("greater than");
        } else if (first < second) {
            System.out.println("less than");
        } else {
            System.out.println("How can this be???");
        }
    }
}
