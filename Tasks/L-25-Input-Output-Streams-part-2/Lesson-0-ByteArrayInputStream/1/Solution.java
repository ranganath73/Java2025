/**
 * In the Solution class, create a 
 * public static bytesToChars(ByteArrayInputStream stream, int n) 
 * method that returns a char[].
 *
 * The method should read the first n bytes from stream and convert them to a character array. 
 * The returned array must have length n, or less if there are fewer than n bytes in the stream.
 *
 * Count each byte as a single character.
 *
 * Requirements:
 * •	The Solution class must have a 
 *      public static public static char[] bytesToChars(ByteArrayInputStream stream, int n) method.
 * •	The bytesToChars method must convert the first n bytes from the stream parameter into 
 *      characters and return them as an array.
 */

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/* 
Bytes to characters
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    //write your code here

}



// import java.io.ByteArrayInputStream;
// import java.nio.charset.StandardCharsets;

// /* 
// Bytes to characters
// */

// public class Solution {

//     public static void main(String[] args) {
//         ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
//         System.out.println(new String(bytesToChars(stream, 38)));
//     }

//     public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
//         byte[] bytes = stream.readAllBytes();
//         int minLength = Math.min(n, bytes.length);
//         char[] result = new char[minLength];
//         for (int i = 0; i < minLength; i++) {
//             result[i] = (char) bytes[i];
//         }
//         return result;
//     }
// }
