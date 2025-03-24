/**
 * In the copyFile method, catch the exceptions thrown by the readFile and writeFile methods.
 * Wrap the caught exceptions in a RuntimeException and rethrow them.
 *
 * Requirements:
 * •	FileNotFoundExceptions and FileSystemExceptions must be caught in the copyFile method.
 * •	All caught exceptions must be wrapped in a RuntimeException and rethrown.
 * •	The copyFile method must not have any exceptions in a throws clause.
 */

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Wrapping exceptions
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        FileUtils.readFile(sourceFile);
        FileUtils.writeFile(destinationFile);
        //write your code here
    }
}
