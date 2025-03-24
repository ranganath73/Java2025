/**
 * In the main method, catch the exception and output its stack trace.
 *
 * Requirements:
 * •	The main() method should call the dangerousMethod() method.
 * •	The dangerousMethod method should throw an Exception.
 * •	The main method should display the stack trace of the caught exception.
 */

/* 
Logging a stack trace
*/

public class Solution {

    public static void main(String[] args) {
        dangerousMethod();
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
