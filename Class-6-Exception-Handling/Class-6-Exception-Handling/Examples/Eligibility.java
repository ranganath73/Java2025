import java.util.Scanner;

public class Eligibility
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        byte age = scan.nextByte();

        // assert (age > 18);
        assert (age > 18) : "You may apply later";

        System.out.println("You are welcome to our company.");
    }
    
}