/**
 * The Solution class declares a HashMap<String, Double> grades field, 
 * whose key is the student's full name, and whose value is the student's average grade. 
 * Let's try to create a method that will display complete information about students. 
 * Use the entrySet method of the HashMap class.
 *
 * The output should be as follows: [full name] : [average grade]
 * 
 * For a student named Alfred Tennyson whose average grade is 4.5, 
 * the output will be as follows:
 * 
 * Alfred Tennyson : 4.5
 *
 * Requirements:
 * •	The Solution class must have an initialized public static HashMap<String, Double> grades field.
 * •	The printStudentsInfo method should display text on the console in accordance with the 
 *      task conditions.
 */

import java.util.HashMap;
import java.util.Map;

/* 
Student performance — 3
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Walt Whitman", 4.3d);
        grades.put("Emily Dickenson", 4.1d);
        grades.put("William Shakespeare", 4.9d);
        grades.put("Maya Angelou", 3.7d);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudentsInfo() {
        //write your code here
    }
}





// import java.util.HashMap;
// import java.util.Map;

// /* 
// Student performance — 3
// */

// public class Solution {
//     public static HashMap<String, Double> grades = new HashMap<>();

//     public static void main(String[] args) {
//         addStudents();
//         printStudentsInfo();
//     }

//     public static void addStudents() {
//         grades.put("Walt Whitman", 4.3d);
//         grades.put("Emily Dickenson", 4.1d);
//         grades.put("William Shakespeare", 4.9d);
//         grades.put("Maya Angelou", 3.7d);
//         grades.put("Shel Silverstein", 3.2d);
//     }
//// |=============| for(Map.Entry<String, Double> pair : grades.entrySet()) |===============|
//     public static void printStudentsInfo() {
//         for (var pair : grades.entrySet())
//         {
//             String key = pair.getKey();
//             Double value = pair.getValue();
//             System.out.println(key + " : " + value);
//         }
//     }
// }
