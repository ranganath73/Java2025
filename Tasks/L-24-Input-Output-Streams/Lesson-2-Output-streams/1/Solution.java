/**
 * You have a program that reads a path to a file from the console 
 * and writes a sequence of bytes to this file. But the program has a bug.
 *
 * As you already know, Writer "doesn't work" with bytes: 
 * to write bytes to a file, you need to use a FileOutputStream.
 * 
 * Your task is to fix the program.
 *
 * Requirements:
 * •	The program should read a path to a file from the console.
 * •	The program should rewrite bytes to a file.
 * •	A FileOutputStream must be used to write bytes.
 * •	The stream for writing must be closed.
 */

import java.io.*;
import java.util.Scanner;

/* 
Writing bytes to a file
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Writer writer = new FileWriter(scanner.nextLine())) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            writer.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}