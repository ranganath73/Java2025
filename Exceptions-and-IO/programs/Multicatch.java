public class Multicatch
{
   public static void main(String[ ] args) {
       try{
            int a[ ] = new int[2];
            System.out.println(a[10]);

            int b = 10;
            System.out.println(b/0);

       }catch(ArithmeticException aeiou){
           System.out.println("Divided by zero");
       } catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array index is more");
       }
       
       finally {
           System.out.println("This program uses an integer array.");
       }
    }
}