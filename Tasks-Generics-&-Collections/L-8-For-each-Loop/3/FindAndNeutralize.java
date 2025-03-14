/**
 * The Solution declares the following methods, which you need to implement:
 *
 * removeBugWithFor(ArrayList<String>) should use a for loop and a counter 
 * to remove strings from the list if they contain the word bug.
 * removeBugWithWhile(ArrayList<String>) should use a while loop and the iterator() 
 * method to remove strings from the list if they contain the word bug.
 * removeBugWithCopy(ArrayList<String>) should use a for-each loop and 
 * copy of the list to remove strings from the list if they contain the word bug.
 * The word bug may appear with different combinations of uppercase and lowercase letters 
 * (BUg, BuG, etc.).
 * 
 * The main method is implemented for you and is not checked.
 * Requirements:
 * •	The Solution class must have a public static removeBugWithFor(ArrayList<String>) method 
 *      with a void return type.
 * •	The Solution class must have a public static removeBugWithWhile(ArrayList<String>) 
 *      method with a void return type.
 * •	The Solution class must have a public static removeBugWithCopy(ArrayList<String>) method 
 *      with a void return type.
 * •	The removeBugWithFor(ArrayList<String>) method must work in accordance with the task conditions.
 * •	The removeBugWithWhile(ArrayList<String>) method must work in accordance with the task conditions.
 * •	The removeBugWithCopy(ArrayList<String>) method must work in accordance with the task conditions.
 */

import java.util.ArrayList;
import java.util.Iterator;

/* 
Find and neutralize
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //write your code here
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //write your code here
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //write your code here
    }
}





// import java.util.ArrayList;
// import java.util.Iterator;

// /* 
// Find and neutralize
// */

// public class Solution {
//     public static String bug = "bug";

//     public static void main(String[] args) {
//         ArrayList<String> words = new ArrayList<>();
//         words.add("Hello world!");
//         words.add("Amigo");
//         words.add("Elly");
//         words.add("Kerry");
//         words.add("Bug");
//         words.add("bug");
//         words.add("Easy ug");
//         words.add("Risha");

//         ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
//         ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
//         ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

//         removeBugWithFor(wordsFirstCopy);
//         removeBugWithWhile(wordsSecondCopy);
//         removeBugWithCopy(wordsThirdCopy);

//         wordsFirstCopy.forEach(System.out::println);
//         String line = "_________________________";
//         System.out.println(line);
//         wordsSecondCopy.forEach(System.out::println);
//         System.out.println(line);
//         wordsThirdCopy.forEach(System.out::println);
//         System.out.println(line);
//     }

//     public static void removeBugWithFor(ArrayList<String> list) {
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i).equalsIgnoreCase(bug)) {
//                 list.remove(i);
//                 i--;
//             }
//         }
//     }

//     public static void removeBugWithWhile(ArrayList<String> list) {
//         Iterator it = list.iterator();
//         while (it.hasNext()) {
//             String word = (String) it.next();
//             if (word.equalsIgnoreCase(bug)) {
//                 it.remove();
//             }
//         }
//     }

//     public static void removeBugWithCopy(ArrayList<String> list) {
//         ArrayList<String> listCopy = new ArrayList<>(list);
//         for (String word : listCopy)
//         {
//             if (word.equalsIgnoreCase(bug))
//             {
//                 list.remove(word);
//             }
//         }
//     }
// }
