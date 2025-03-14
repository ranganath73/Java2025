/**
 * The Solution class has a print(HashSet<String>) method that 
 * should display all the elements using the iterator() method.
 * The main method is not checked.
 * 
 * Requirements:
 * •	The Solution class must have a public static print(HashSet<String>) method 
 *      with a void return type.
 * •	The print(HashSet<String>) method must work in accordance with the task conditions.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Displaying the elements of a set
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //write your code here
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        print(words);
    }
}
