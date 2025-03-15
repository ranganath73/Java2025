
// This is an example to show throw and throws keyword and creating an user-defined exception class.

public class MyException extends Exception{
    
    public static int div(int a, int b) throws ArithmeticException {

        if(b == 0) {
            throw new ArithmeticException("Don't divide any number by zero.");
        } else {
            return a / b;
        }
    }
    
}
