public class MyClass {
	
	static int div(int a, int b)throws ArithmeticException​ {
          if(b == 0) {
              throw new ArithmeticException("Division by Zero");
          } else {
             return a / b;
          }
        }
    
    public static void main(String[ ] args) {
          try{ 
            int a[ ] = new int[2];
           // System.out.println(a[5]);
	    int b = div(5,0);
	    System.out.println(b);
	    }catch(ArithmeticException e) {
	    
	   	e.printStackTrace();
	    	//System.out.println("This is an array problem.");
	    } finally {
	    	System.out.println("Message.");
	    }
    }
}
