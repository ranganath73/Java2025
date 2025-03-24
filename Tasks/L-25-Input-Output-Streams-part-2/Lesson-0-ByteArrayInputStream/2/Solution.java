/**
 * Try running the program. 
 * As you can see, the fromString method works fine if you pass it a valid string. 
 * But if you pass it an empty string, then you get an exception, 
 * and the MyStream object does not execute the close method.
 *
 * Fix the fromString method so that the MyStream object calls the 
 * close method even we pass an empty string to fromString.
 *
 * Requirements:
 * •	The fromString method should not change its behavior if a valid string is passed to it.
 * •	The fromString method should rethrow (not catch) any exceptions that occur.
 * •	The fromString method must call the close method on the MyStream object 
 *      if an empty string is passed to fromString.
 */

import java.io.*;
import java.util.Base64;

/* 
Don't skip closing
*/

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String string = toString(new MyClass("The quick brown fox jumps over the lazy dog."));
            System.out.printf("Object as a string: %s\n", string);

            MyClass myClass = (MyClass) fromString(string);
            System.out.println("Recovered object: " + myClass);

            System.out.println();
            fromString("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(Serializable o) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public static Object fromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        MyStream ms = new MyStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(ms)) {
            Object o = ois.readObject();
            return o;
        }
    }
}
