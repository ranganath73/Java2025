/**
 * The main method creates and fills a list of various objects 
 * and passes it to the checkElementsType(ArrayList<Object>) method.
 * 
 * Your task is to implement this method, which should determine the 
 * type of each element in the list, and also:
 *
 * For String objects, call the printString() method
 * For Integer objects, call the printInteger() method
 * For Integer[] objects, call the printIntegerArray() method
 * For all other types of objects, call the printUnknown() method
 * 
 * The main method is not checked.
 * Requirements:
 * •	Do not change the declaration and implementation of the printString(String) method.
 * •	Do not change the declaration and implementation of the printInteger(Integer) method.
 * •	Do not change the declaration and implementation of the printIntegerArray(Integer[]) method.
 * •	Do not change the declaration and implementation of the printUnknown(Object) method.
 * •	The checkElementsType(ArrayList<Object>) method should work in accordance with the task conditions.
 */

import java.util.ArrayList;

/* 
Chasing after types
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Hello");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //write your code here
    }

    public static void printString() {
        System.out.println("String");
    }

    public static void printInteger() {
        System.out.println("Integer");
    }

    public static void printIntegerArray() {
        System.out.println("Array of integers");
    }

    public static void printUnknown() {
        System.out.println("Other data type");
    }
}
