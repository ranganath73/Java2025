/**
 * The Solution class declares a HashMap<String, Double> grades field, 
 * whose key is the student's full name, and whose value is the student's average grade. 
 * Your task is to implement the addStudents method, which will add 5 students 
 * together with their average grade to the grades collection.
 * 
 * You can choose any values.
 *
 * Requirements:
 * •	In the Solution class, you need to initialize a public static HashMap<String, Double> 
 *      grades field.
 * •	The Solution class must have a public static addStudents method with a void return type.
 * •	The addStudents method should add 5 students and their average grade to the grades field.
 */

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //write your code here
    }
}
