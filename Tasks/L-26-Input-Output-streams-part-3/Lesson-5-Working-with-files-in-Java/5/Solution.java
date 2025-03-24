/**
 * Write a program that reads paths to two directories from the keyboard 
 * and moves files from one directory to the other (only files, ignore directories). 
 * Use the appropriate methods of the Files class: 
 * newDirectoryStream(), isRegularFile() or isDirectory(), move().
 *
 * Requirements:
 * •	The program should read directory paths from the console.
 * •	The program must use the appropriate methods of the Files class in accordance 
 *      with the task conditions.
 * •	The program should move files from one directory to another in accordance with 
 *      the task conditions.
 * •	Do not use the following classes: 
 *          File, FileInputStream, FileOutputStream, FileReader, 
 *          FileWriter (of the java.io package).
 */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Moving files
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //write your code here
    }
}

