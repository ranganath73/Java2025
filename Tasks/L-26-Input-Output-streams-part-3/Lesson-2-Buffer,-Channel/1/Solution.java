/**
 * Implement the trimByPosition method: 
 * it should trim the file represented by fileChannel to its current position.
 *
 * Requirements:
 * •	The trimByPosition method must determine the current position of the fileChannel 
 *      file channel.
 * •	The trimByPosition method should trim the fileChannel file channel to the 
 *      current position.
 */

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Splitting a file into parts
*/

public class Solution {

    public static void main(String[] args) {
        try (FileChannel channel = FileChannel.open(Paths.get("c:/test/file.txt"), StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buf = ByteBuffer.allocate(64);
            channel.read(buf);
            System.out.println("The file should still contain:\n" + new String(buf.array(), StandardCharsets.UTF_8));
            trimByPosition(channel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void trimByPosition(FileChannel fileChannel) throws IOException {
        //write your code here

    }
}
