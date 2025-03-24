/**
 * You need to write a program that reads two file paths from the keyboard.
 *
 * If the file at the first path does not exist, it must be created.
 * If the file at the first path exists, you need to move this file to the second path, 
 * but only if there is no file at the second path.
 * If there is, then you just need to delete the file at the first path.
 * Use the appropriate methods of the Files class: 
 * createFile(), move(), delete(), exists()/notExists().
 * 
 * Requirements:
 * •	The program should read two paths from the console.
 * •	The program must use the appropriate methods of the Files class: 
 *      createFile(Path.class), move(Path, Path), delete(Path), exists(Path)/notExists(Path).
 * •	The program should process the entered paths in accordance with the task conditions.
 * •	Do not use the following classes: File, FileInputStream, FileOutputStream, 
 *      FileReader, FileWriter (of the java.io package). 
 *
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
File operations
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //write your code here
    }
}

