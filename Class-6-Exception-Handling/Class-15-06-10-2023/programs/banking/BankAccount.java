public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double deposit)
    {
        this.balance += deposit;
    }

    public void withdraw(double withdrawAmount) throws InsufficientBalanceException
    {
        if (withdrawAmount > balance)
        {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        this.balance -= withdrawAmount;
    }

    public double getBalance()
    {
        return balance;
    }
}