public class DivByZero
{

    public static int div(int a, int b) throws ArithmeticException
    {
        if(b == 0) {
            throw new ArithmeticException("Divide by a number other than zero");
        }
        return (a / b);
    }

    public static void main(String[] args) // throws ArithmeticException  // throws clause
    {
        try {
            System.out.println(div(7, 0));    // 7/9 = 0.7
        } catch (ArithmeticException ae) {
            System.out.println("Division By Zero.");
            // ae.printStackTrace();
        }

        
    }
}