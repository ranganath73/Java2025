
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            int number1 = scan.nextInt(); // 
            int number2 = scan.nextInt();
            System.out.println("Enter \"Exit\" to exit");
            String operator = scan.next();
            if (operator.equalsIgnoreCase("exit")) break;
            int result;
        
        switch(operator) {
            case "add":
                System.out.println(number1 + number2);
                break;
            case "sub":
                System.out.println(number1 - number2);
                break;
            case "mul":
                System.out.println(number1 * number2);
                break;
            case "div":
                System.out.println(number1 / number2);
                break;
            case "mod":
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Something else");
        }
        }        
    }
}
