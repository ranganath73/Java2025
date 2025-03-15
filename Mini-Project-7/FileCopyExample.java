import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String byteCopyFile = "byteCopy.txt";
        String charCopyFile = "charCopy.txt";

        // Create the source file with some content
        createSourceFile(sourceFile);

        // Copy using byte-oriented streams
        copyBytes(sourceFile, byteCopyFile);

        // Copy using character-oriented streams
        copyCharacters(sourceFile, charCopyFile);

        System.out.println("File copying completed.");
    }

    // Create a source file with sample text
    public static void createSourceFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            String data = "This is a sample text file.";
            writer.write(data);
            System.out.println("Source file created: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Copy using byte-oriented streams
    public static void copyBytes(String sourceFileName, String destFileName) {
        try (FileInputStream fis = new FileInputStream(sourceFileName);
             FileOutputStream fos = new FileOutputStream(destFileName)) {
            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("File copied using byte-oriented streams.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Copy using character-oriented streams
    public static void copyCharacters(String sourceFileName, String destFileName) {
        try (FileReader reader = new FileReader(sourceFileName);
             FileWriter writer = new FileWriter(destFileName)) {
            int charContent;
            while ((charContent = reader.read()) != -1) {
                writer.write(charContent);
            }
            System.out.println("File copied using character-oriented streams.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
