public class BankingApp
{
    public static void main(String[] args) throws InsufficientBalanceException
    {
        BankAccount raja = new BankAccount(10000.0);
        BankAccount rubin = new BankAccount(5000.0);

        raja.deposit(1000.0);
        System.out.println("The total balance is: " + raja.getBalance());

        rubin.deposit(1000);
        System.out.println("The total balance is: " + rubin.getBalance());
    
        raja.withdraw(5000.0);
        System.out.println("The available balance is: " + raja.getBalance());

        rubin.withdraw(7000.0);
        System.out.println("The available balance is: " + rubin.getBalance());
    }
}