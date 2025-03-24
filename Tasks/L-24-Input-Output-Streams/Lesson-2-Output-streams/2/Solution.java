/**
 * There is a program that reads a path to a file from the console 
 * and writes to this file a sequence of characters after first 
 * converting the characters to bytes.
 *
 * Your task is to remove this unnecessary conversion from the program. 
 * In other words, rewrite the code so that the characters are written directly to the file.
 *
 * As you already know, you need to use a FileWriter to write characters to a file.
 *
 * Requirements:
 * •	The program should read a path to a file from the console.
 * •	The program must rewrite the characters in the file.
 * •	A FileWriter must be used to write characters.
 * •	The stream for writing must be closed
 */


import java.io.*;
import java.util.Scanner;

/* 
Writing characters to a file
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream output = new FileOutputStream(scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            for (char aChar : chars) {
                output.write((byte)aChar);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}