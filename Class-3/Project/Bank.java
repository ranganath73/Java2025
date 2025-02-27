import java.util.Scanner;

public class Bank {

    public static double balance = 0.0;

    public static void deposit(double amount) {    // without return type and with argument
        balance = amount;

        System.out.println("Money has been deposited. -> Balance : " + balance);
    }

    public static void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            System.out.println("Recieve the amount : " );
            System.out.println("The  current balance is : " + (balance - amount));
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long accountNumber = 4562586;

        String name = "Charles";

        double amount = input.nextDouble();

        double withdrawAmount = input.nextDouble();

        deposit(amount);

        withdraw(withdrawAmount);
    }
}


