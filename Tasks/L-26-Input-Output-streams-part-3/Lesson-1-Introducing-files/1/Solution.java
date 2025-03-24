/**
 * Write a program in which the user enters a path to a file or folder from the keyboard, 
 * and then the drive (or root for Unix-like paths) where the file (or folder) is 
 * located is displayed on the console.
 * 
 * To solve this task, use Path and its methods.
 *
 * Requirements:
 * •	The program should read a file/directory path from the console.
 * •	The program should display the drive on which this file (or folder) is located.
 * •	To get the drive from a path, use the getRoot() method of the Path class.
 * •	Do not use the following classes: File, FileInputStream, FileOutputStream, 
 *      FileReader, FileWriter (of the java.io package).
 */

import java.nio.file.Path;
import java.util.Scanner;

/* 
Get to the root cause
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //write your code here
    }
}

