/**
 * The Solution class has a number field, a string field, and a main method with variables declared in it. You need to replace the variable declarations with var where possible. The order of the variables must not be changed.

Example:
Scanner console = new Scanner(System.in);
Replace with:
var console = new Scanner(System.in);

Requirements:
•	Replace the variables' types with var wherever possible.
•	Do not change the right side of the expressions.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Onward to the future
*/

public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        int integer = 22;
        String string = "string";
        int[] array = new int[5];
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
