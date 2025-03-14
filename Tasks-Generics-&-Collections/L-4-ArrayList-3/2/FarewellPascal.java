/**
 * In the main method, find and remove the Pascal programming language 
 * from the programmingLanguages list.
 *
 * Requirements:
 * •	The main method should remove Pascal from the programmingLanguages list.
 */


import java.util.ArrayList;
import java.util.Arrays;

/* 
Farewell, Pascal
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //write your code here
    }
}

// public class Solution {
//     public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

//     public static void main(String[] args) {
//         for (int i = 0; i < programmingLanguages.size(); i++) {
//             if (programmingLanguages.get(i) == "Pascal") { // use equals method
//                 programmingLanguages.remove(i);
                        // break;
//             }
//         }
//     }
// }
