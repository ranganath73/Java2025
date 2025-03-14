/**
 * The Solution class declares a HashMap<String, Double> grades field, 
 * whose key is the student's full name, and whose value is the student's average grade. 
 * This time your task is to implement the following methods:
 * printStudents, which prints only the names of each student (the collection's key);
 * getAverageMark, which returns the average grade of all students.
 * 
 * Requirements:
 * •	In the Solution class, you need to initialize a public static HashMap<String, Double> 
 *      grades field.
 * •	The printStudents method should print each student (full name) in the grades 
 *      collection on a new line.
 * •	The getAverageMark method should return the average grade of all students in 
 *      the grades collection.
 */


import java.util.HashMap;

/* 
Student performance — 2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Student list: ");
        printStudents();
        System.out.print("Average grade: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("William Butler Yeats", 4.3d);
        grades.put("Emily Dickenson", 4.1d);
        grades.put("William Shakespeare", 4.9d);
        grades.put("Maya Angelou", 3.7d);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudents() {
        //write your code here
    }

    public static Double getAverageMark() {
        //write your code here
    }
}



|===========| Solution #1 |===============|
// import java.util.HashMap;

// /* 
// Student performance — 2
// */

// public class Solution {
//     public static HashMap<String, Double> grades = new HashMap<>();

//     public static void main(String[] args) {
//         addStudents();
//         System.out.println("Student list: ");
//         printStudents();
//         System.out.print("Average grade: " + getAverageMark());
//     }

//     public static void addStudents() {
//         grades.put("William Butler Yeats", 4.3d);
//         grades.put("Emily Dickenson", 4.1d);
//         grades.put("William Shakespeare", 4.9d);
//         grades.put("Maya Angelou", 3.7d);
//         grades.put("Shel Silverstein", 3.2d);
//     }

//     public static void printStudents() {
//         for (String name : grades.keySet())
//         {
//             System.out.println(name);
//         }
//     }

//     public static Double getAverageMark() {
//         Double average = 0.0;
//         int count = 0;
//         for (String key : grades.keySet())
//         {
//             average += grades.get(key);
//             count++;
//         }
//         average = average / count;
//         return average;
//     }
// }


|============| Solution #2 |===============|
// import java.util.HashMap;

// /* 
// Student performance — 2
// */

// public class Solution {
//     public static HashMap<String, Double> grades = new HashMap<>();

//     public static void main(String[] args) {
//         addStudents();
//         System.out.println("Student list: ");
//         printStudents();
//         System.out.print("Average grade: " + getAverageMark());
//     }

//     public static void addStudents() {
//         grades.put("William Butler Yeats", 4.3d);
//         grades.put("Emily Dickenson", 4.1d);
//         grades.put("William Shakespeare", 4.9d);
//         grades.put("Maya Angelou", 3.7d);
//         grades.put("Shel Silverstein", 3.2d);
//     }

//     public static void printStudents() {
//         for (String name : grades.keySet())
//         {
//             System.out.println(name);
//         }
//     }

//     public static Double getAverageMark() {
//         Double average = 0.0;
//         for (String key : grades.keySet())
//         {
//             average += grades.get(key);
//             count++;
//         }
//         average = average / grades.size();
//         return average;
//     }
// }
