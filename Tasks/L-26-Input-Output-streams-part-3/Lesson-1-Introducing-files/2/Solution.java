/**
 * Write a program that reads two paths from the keyboard and 
 * displays the relative path between these paths, if it exists. 
 * Otherwise, don't display anything.
 * 
 * Hint: If you couldn't find the relative path between path1 and path2, 
 * then try to find the relative path between path2 and path1.
 *
 * Requirements:
 * •	The program should read two paths from the console. 
 * •	The program should display the relative path between the entered paths, if it exists.
 * •	To calculate the relative path, the relativize() method of the Path class 
 *      should be used.
 * •	Do not use the following classes: 
 *      File, FileInputStream, FileOutputStream, FileReader, 
 *      FileWriter (of the java.io package).
 */

import java.nio.file.Path;
import java.util.Scanner;

/* 
It's all relative
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //write your code here
    }
}

