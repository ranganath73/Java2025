public class CheckedException
{
    public static void main(String[] args) //throws InterruptedException
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted.");
        }
        
    }
}