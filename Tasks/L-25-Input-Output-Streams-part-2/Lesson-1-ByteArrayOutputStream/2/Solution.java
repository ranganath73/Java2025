/**
 * Refactor the writeData method: instead of writing to a file, 
 * write the received data to a ByteArrayOutputStream and return the resulting stream.
 *
 * Requirements:
 *  The writeData method's return type must be ByteArrayOutputStream.
 *  The writeData method must return a stream with the same data that 
 *  was previously written to the file.
 */

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
Replacing a stream
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        try (ByteArrayOutputStream fos = new ByteArrayOutputStream()) {
            fos.write(("Name: " + name + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Email: " + email + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Level: " + level + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Rating: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
            return fos;
        }
    }
}