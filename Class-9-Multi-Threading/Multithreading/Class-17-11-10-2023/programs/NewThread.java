public class NewThread extends Thread
{
    private int threadNumber;

    public NewThread(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }
    
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
                   
            System.out.println(i + "from thread number " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ie) {

            }
            
        }
    }
}





// public class InsufficientBalanceException extends Exception{}