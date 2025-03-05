import java.util.Scanner;

public class Bank {

    public static double balance = 0.0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // long accountNumber = 4562586;

        // String name = "Charles";

        double balanceAmount = input.nextDouble();

        double withdrawalAmount = input.nextDouble();

        // Account account = new Account(amount);

        // account.setBalance(amount);
        SavingsAccount savingsAccount = new SavingsAccount(balanceAmount);

        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdrawSavings(withdrawalAmount);

        // double withdrawAmount = input.nextDouble();

        // deposit(amount);

        // withdraw(withdrawAmount);
    }
}


