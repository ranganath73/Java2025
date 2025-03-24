/**
 * The program reads from the console the path to a file, 
 * reads lines from the file, and displays them on the screen.
 * Rewrite the code using try-with-resources: 
 * create objects that use external resources inside the parentheses. 
 * Remember to remove the unnecessary finally block and the calls to the close() method.
 *
 * Requirements:
 * •	The program should read the path to a file from the console, 
 *      then read lines from the file and display them on the screen.
 * •	The program must use the try-with-resources statement as outlined in the task conditions.
 * •	The try-with-resources statement must not have a finally block.
 * •	The close() method must not be explicitly called on objects that use external resources.
 * •	Do not use the following classes from the java.io package: 
 *      File, FileInputStream, FileOutputStream, FileReader, FileWriter.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
There are a lot of resources
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        BufferedReader bufferedReader = null;
        try {
            scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}

