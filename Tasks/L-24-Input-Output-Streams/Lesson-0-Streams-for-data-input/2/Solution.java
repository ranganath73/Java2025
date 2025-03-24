/**
 * There is a program that reads the path to file1 and the path to file2 
 * from the console and copies the contents of file1 to file2.
 *
 * But it doesn't work correctly. Find and fix errors in the code so that the program works as it should.
 * 
 * Requirements:
 * •	The program should read file paths from the console.
 * •	The program must rewrite the contents from one file to another.
 * •	To read from files, the read() method of a FileInputStream object must be used.
 * •	To write to the file, the write() method of the FileOutputStream object must be used.
 * •	Streams for reading and writing must be closed.
 */

import java.io.*;
import java.util.Scanner;

/* 
Something isn't being copied...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (fis.available() > 0) {
                int read = fis.read();
                fos.write(buffer, size, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}