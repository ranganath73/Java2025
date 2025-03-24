/**
 * Write a program that reads a path to a directory from the keyboard, 
 * gets a list of files and directories in that directory, 
 * and displays information about them in the following format:
 * 
 * "<path to file> - This is a file", if it is a file.<путь к файлу>
 * "<path to directory> - This is a directory", if it is a directory.<путь к директории>
 * 
 * Don't display the angled brackets and quotation marks.
 * Use the appropriate methods of the Files class: newDirectoryStream(Path), 
 *  isRegularFile(Path), and isDirectory(Path).
 *
 * Output:
 * C:\codegym\
 * 
 * Output:
 * C:\codegym\test.txt - This is a file
 * C:\codegym\tasks - This is a directory
 * ...
 *
 * Requirements:
 * •	The program should read a directory path from the console.
 * •	The program must use the appropriate methods of the Files class: 
 *          newDirectoryStream(Path), isRegularFile(Path), and isDirectory(Path).
 * •	The program should receive a list of files and directories in a given 
 *          directory and display information in accordance with the task conditions.
 * •	Do not use the following classes: File, FileInputStream, FileOutputStream, 
 *          FileReader, FileWriter (of the java.io package).
 */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
What's inside the folder?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - This is a file";
    private static final String THIS_IS_DIR = " - This is a directory";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //write your code here
    }
}

