/**
 * In the splitFile(String fileName, int partSize) method, 
 * use NIO to split the file named fileName into files that are partSize bytes in size.
 * The new files should have the same name as fileName, 
 * but with number appended to the end of the name. For example:
 *
 * original file — file.txt
 * new files — file1.txt, file2.txt, file3.txt etc.
 * Before creating new files, you must check that they do not already exist. 
 * If files with the same names already exist, then overwrite them.
 *
 * Example: if the original file is 25 bytes in size, and partSize is 10, 
 * then the output should be two files of 10 bytes each and one additional file of 5 bytes.
 *
 * Requirements:
 * •	The splitFile method must not modify the fileName input file.
 * •	The splitFile method must create new files in accordance with the task conditions.
 */

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Let's copy a file
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        splitFile("C:\\test\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            //write your code here

        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
