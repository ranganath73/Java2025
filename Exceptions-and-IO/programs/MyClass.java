public class MyClass {
    public static void main(String[ ] args) {
       try{
            int a[ ] = new int[2];
            System.out.println(a[1]);

       }catch(Exception e){
           System.out.println("Please give a lesser array index but greater than 0");
       } finally {
           System.out.println("This program uses an integer array.");
       }
    }
}