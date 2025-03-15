import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        // File paths for demonstration
        String byteFile = "byteStream.txt";
        String charFile = "charStream.txt";

        // Byte-oriented stream example
        writeBytesToFile(byteFile);
        readBytesFromFile(byteFile);

        // Character-oriented stream example
        writeCharsToFile(charFile);
        readCharsFromFile(charFile);
    }

    // Byte-oriented stream: Writing bytes to a file
    public static void writeBytesToFile(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            String data = "Hello, Byte Streams!";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Bytes written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Byte-oriented stream: Reading bytes from a file
    public static void readBytesFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content); // Convert bytes to characters
            }
            System.out.println("\nBytes read from " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Character-oriented stream: Writing characters to a file
    public static void writeCharsToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            String data = "Hello, Character Streams!";
            writer.write(data);
            System.out.println("Characters written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Character-oriented stream: Reading characters from a file
    public static void readCharsFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int content;
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\nCharacters read from " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
