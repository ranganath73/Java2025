/**
 * Write a program that reads lines from the keyboard, 
 * and if a given line is a path to an existing file, 
 * then display the following on the console: 
 * "<input string> - This is a file".<введенная строка> If the path is to an existing directory,
 * then display the following on the console: "<input string> - This is a directory".
 * <введенная строка>
 * If the line is not a path to a file or directory, then exit the program. 
 * Don't display the angled brackets and quotation marks.
 * To check files and directories, use the isRegularFile() and isDirectory() 
 * methods of the Files class.
 *
 * Example output:
 * C:\codegym\test.txt - This is a file
 * C:\codegym - This is a directory
 *
 * Requirements:
 * •	The program should read paths to files/directories from the console until an 
 *      invalid path is entered.
 * •	The program should display information about the entered path in accordance 
 *      with the task conditions.
 * •	The isRegularFile() and isDirectory() methods of the Files class must be 
 *      used to check files and directories.
 * •	Do not use the following classes: File, FileInputStream, FileOutputStream, 
 *      FileReader, FileWriter (of the java.io package).
 *
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
File or directory
*/

public class Solution {
    private static final String THIS_IS_FILE = " - This is a file";
    private static final String THIS_IS_DIR = " - This is a directory";

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (true) {
            str = scanner.nextLine();
            if (str == "") {
                break;
            } else if (Files.isRegularFile(Path.of(str)))
            {
                System.out.println(str + " " + THIS_IS_FILE);
            }
            else if (Files.isDirectory(Path.of(str)))
            {
                System.out.println(str + " " + THIS_IS_DIR);
            }
            else
            {
                break;
            }
        }
    }
}