public class ThrowAndThrows {
    
    public static int div(int a, int b) throws ArithmeticException {

        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(div(10, 0));
    }
}
