import java.util.Scanner;


public class DataTypes {

    public static void main(String[] args) {

        // // Primitive
        //     byte 1 byte  -128 to 127
        //     short 2 byte   
        //     int  4
        //     long 8

        //     float   4 bytes
        //     double 8 bytes

        //     char  => 16 bit

        //     boolean => true/false


        // //   Non-Primitive

        // String name = "Rohit Sarkar";

        // // Wrapper classes 1.5

        // Byte;
        // Short;
        // Integer;
        // Long;

        // Float;
        // Double;

        // Character;

        // Boolean;

        // Negative, positive, zero
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        }
    }
}