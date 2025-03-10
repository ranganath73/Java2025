public class ArrayException
{
    public static void main(String[] args)
    {
        int[] numbers = {15, 45, 69, 78};

        try {
            System.out.println(numbers[0]);
        } catch(Exception e) {
            System.out.println("Please enter a lesser index.");
        } finally {
            System.out.println("I am in finally.");
        }
        
    }
}