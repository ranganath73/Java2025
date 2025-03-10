public class InsufficientBalanceException extends Exception // custom defined exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }   
}