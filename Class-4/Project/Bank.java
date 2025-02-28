import java.util.Scanner;

public class Bank {

    public static double balance = 0.0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // long accountNumber = 4562586;

        // String name = "Charles";

        double amount = input.nextDouble();

        Account account = new Account(amount);

        // account.setBalance(amount);

        System.out.println(account.getBalance());

        // double withdrawAmount = input.nextDouble();

        // deposit(amount);

        // withdraw(withdrawAmount);
    }
}


