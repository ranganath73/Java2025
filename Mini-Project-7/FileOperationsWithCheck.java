import java.io.*;

public class FileOperationsWithCheck {
    public static void main(String[] args) {
        String fileName = "SampleFile.txt";
        
        // Create a sample file with mixed data
        createSampleFile(fileName);
        
        // Perform file operations
        performFileOperations(fileName);
    }

    // Create a sample file with mixed data
    public static void createSampleFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Hello, World!");
            writer.println("12345");
            writer.println("67890");
            writer.println("Sample Text");
            writer.println("42");
            writer.println("3.14");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Perform file operations and check for integers or strings
    public static void performFileOperations(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.err.println("Error: The file does not exist.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int totalLength = 0;
            boolean containsIntegers = false;
            boolean containsStrings = false;

            while ((line = reader.readLine()) != null) {
                totalLength += line.length();

                if (line.matches("-?\\d+")) {
                    containsIntegers = true;
                } else {
                    containsStrings = true;
                }
            }

            System.out.println("File Length: " + totalLength + " characters");

            if (containsIntegers && containsStrings) {
                System.out.println("The file contains both integers and strings.");
            } else if (containsIntegers) {
                System.out.println("The file contains integers only.");
            } else if (containsStrings) {
                System.out.println("The file contains strings only.");
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
