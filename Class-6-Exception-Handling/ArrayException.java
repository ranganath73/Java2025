public class ArrayException {

    public static void main(String[] ar) {

        int a[] = {1,5,8,7,9,11,56,78};

        try {
            // System.out.println(a[8]);  // throw an exception
            System.out.println(a[7]);
        } catch(Exception e) {
            System.out.println("Please provide a lesser index");
        } finally {
            System.out.println("I will always execute.");
        }
        
    }
}