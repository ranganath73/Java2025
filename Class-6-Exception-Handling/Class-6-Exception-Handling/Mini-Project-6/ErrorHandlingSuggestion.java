import java.util.Scanner;

public class ErrorHandlingSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered a valid number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            System.out.println("Consider using try-catch to handle such input errors.");
        }
    }
}
