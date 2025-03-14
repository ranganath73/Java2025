/**
 * Different types of objects are created in the main method. In some cases, you can omit the type of an object's elements and simply use the diamond operator (<>).
Replace the object's element type with the diamond operator where possible, without changing the left side of the expressions.
The order of the variables must not be changed.

Requirements:
•	Where possible, replace the element type with the diamond operator.
•	Do not change the left side of the expressions.
 */


import java.io.File;
import java.util.*;

/* 
Shine bright like a diamond
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
