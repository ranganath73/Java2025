/**
 * The program reads a line from the console and displays the list of letters 
 * that make up the input string.
 * Without changing the functionality of the program, 
 * rewrite the code using a Scanner to read from the console.
 * 
 * Requirements:
 * •	The program should read a line from the console and display the list of letters 
 *      that make up the input string.
 * •	To read from the console, the program should use Scanner instead of BufferedReader.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Reading from the console once again
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader)) {
            String line = buff.readLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

