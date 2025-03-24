/**
 * Encrypt a message by rewriting bytes from a String variable 
 * (a parameter of the encrypt method) to a ByteArrayOutputStream 
 * according to a certain rule:
 * 
 * first, last, second, second to last, third, ...
 *
 * Requirements:
 * •	The encrypt method must return a stream containing all the bytes from the 
 *      message string.
 * •	The bytes in the returned stream must be shuffled in accordance with the 
 *      task conditions.
 */

import java.io.ByteArrayOutputStream;

/* 
Cipher
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        //write your code here

        return new ByteArrayOutputStream();
    }
}





    // public static ByteArrayOutputStream encrypt(String message) {
    //     //write your code here
    //     ByteArrayOutputStream stream = new ByteArrayOutputStream();
    //     byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
    //     int length = bytes.length;
    //     for (int i = 0; i < length / 2; i++) {
    //         stream.write(bytes[i]);
    //         stream.write(bytes[length - i - 1]);
    //     }
    //     return stream;
    // }


