import java.util.Scanner;

public class RecievingInput {
    
    public static void main(String[] args) {
        
        // Do this once //
        Scanner input = new Scanner(System.in);

        // Can call this for multiple times //
        String value = input.next();

        char charValue = value.charAt(0);
        ////////////////////////////////////

        System.out.println(charValue);

                // Can call this for multiple times //
                value = input.next();

                charValue = value.charAt(0);
                ////////////////////////////////////

                System.out.println(charValue);


        input.close();
    }
}
