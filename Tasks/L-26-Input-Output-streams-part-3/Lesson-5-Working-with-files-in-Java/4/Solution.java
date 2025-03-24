/**
 * Write a program that reads paths to two directories from the keyboard 
 * and copies files from one directory to the other (only files, ignore directories).
 * Use the appropriate methods of the Files class: 
 * newDirectoryStream(), isRegularFile() or isDirectory(), copy().
 *
 * Requirements:
 * •	The program should read a directory path from the console.
 * •	The program must use the appropriate methods of the Files class: 
 *          newDirectoryStream(), isRegularFile() or isDirectory(), copy().
 * •	The program should copy files from one directory to another in accordance 
 *          with the task conditions.
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
Shallow copy
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //write your code here
    }
}



// import java.io.IOException;
// import java.nio.file.DirectoryStream;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.Scanner;

// /* 
// Shallow copy
// */

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         Scanner scanner = new Scanner(System.in);
//         Path sourceDirectory = Path.of(scanner.nextLine());
//         Path targetDirectory = Path.of(scanner.nextLine());
//         try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
//             for (Path path : files) {
//                 if (Files.isRegularFile(path)) {
//                     Path resolve = targetDirectory.resolve(path.getFileName());
//                     Files.copy(path, resolve);
//                 }
//             }
//         }
//     }
// }

