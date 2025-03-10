public class ArrayExceptionExample
{

    public static void main(String[] args) {
        
        int[] a = {10,15,65,87};

        try {
            
            // System.out.println(a[10]);  // UnChecked exception
            System.out.println(a[3]);

        } catch (Exception e) {
            System.out.println("Use a small index in this array");
            // e.printStackTrace();
        } finally {
            System.out.println("I am finally");
        }
        

    }
}

