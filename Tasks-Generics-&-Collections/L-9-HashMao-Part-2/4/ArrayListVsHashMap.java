/**
 * The Solution class has a getProgrammingLanguages method that returns a 
 * list of programming languages. 
 * You need to rewrite this method so that it return a HashMap<Integer, String>. 
 * For this collection, the key will be the index of the element in the ArrayList.
 *
 * Requirements:
 * •	The Solution class should have a public static getProgrammingLanguages method 
 *      that returns a HashMap<Integer, String>.
 * •	The getProgrammingLanguages() method should return a HashMap filled with the 
 *      values in the list.
 */

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static ArrayList<String> getProgrammingLanguages() {
        //write your code here
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;
    }

}
