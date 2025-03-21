import java.security.SecureRandom;

public class PrintTask implements Runnable
{
    private final static SecureRandom generator = new SecureRandom();
    private final int sleepTime;
    private final String taskName;

    public PrintTask(String taskName)
    {
        this.taskName = taskName;

        sleepTime = generator.nextInt(5000); // 0 to 5 seconds
    }

    public void run()
    {
        try {
            System.out.println(taskName + " going to sleep for " + sleepTime + " milliseconds");
            Thread.sleep(sleepTime);
        } catch (InterruptedException exception)
        {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.println(taskName + " done sleeping");
    }
}