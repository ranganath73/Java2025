/**
 * Here is a program that uses the bubble sort algorithm to sorts the elements in a list.
 * Rewrite the code so that instead of an ArrayList<Integer> numbers list it uses an int[] numbers array.
 * The main() and print() methods are not involved in testing.
 *
 * Requirements:
 * •	The numbers field should be an int[].
 * •	The numbers field should be initialized to ten numbers when it is declared.
 * •	The sort() method should sort the elements of the int[] numbers array in ascending order.
 */

import java.util.ArrayList;
import java.util.Arrays;

/* 
Bubble sort
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nSorted numbers in natural order:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}



// public class Solution {

// //    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
//     public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
//     public static void main(String[] args) {
//         print();
//         sort();
//         System.out.println("\nSorted numbers in natural order:");
//         print();
//     }

// //    public static void sort() {
// //        for (int i = 0; i < numbers.size() - 1; i++) {
// //            for (int j = 0; j < numbers.size() - i - 1; j++) {
// //                if (numbers.get(j) > numbers.get(j + 1)) {
// //                    int temp = numbers.get(j);
// //                    numbers.set(j, numbers.get(j + 1));
// //                    numbers.set(j + 1, temp);
// //                }
// //            }
// //        }
// //    }


//     public static void sort() {
//         for (int i = 0; i < numbers.length - 1; i++) {
//             for (int j = 0; j < numbers.length - i - 1; j++) {
//                 if (numbers[j] > numbers[j + 1]) {
//                     int temp = numbers[j];
//                     numbers[j] = numbers[j + 1];
//                     numbers[j + 1] = temp;
//                 }
//             }
//         }
//     }


//     public static void print() {
//         for (int number : numbers) {
//             System.out.print(number + "\t");
//         }
//     }
// }
