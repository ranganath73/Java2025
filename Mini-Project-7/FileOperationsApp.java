import java.io.*;
import java.util.Scanner;

public class FileOperationsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Create a new text file");
            System.out.println("2. Read a text file");
            System.out.println("3. Write to a text file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createTextFile(scanner);
                    break;
                case 2:
                    readTextFile(scanner);
                    break;
                case 3:
                    writeTextFile(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Create a new text file
    public static void createTextFile(Scanner scanner) {
        System.out.print("Enter the file name to create: ");
        String fileName = scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            System.out.println("File '" + fileName + "' created successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Read a text file
    public static void readTextFile(Scanner scanner) {
        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            System.out.println("File content:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Write to a text file
    public static void writeTextFile(Scanner scanner) {
        System.out.print("Enter the file name to write: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the content to write: ");
        String content = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to '" + fileName + "' successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
