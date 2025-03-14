/**
 * The Solution class has a balance field, 
 * which indicates the balance of funds in a bank account. 
 * Initialize it with the value of Integer.MAX_VALUE when it is declared.
 * Implement the processPayment(String) method, 
 * which takes payment instructions and deducts funds 
 * from the account according to the instructions.
 * 
 * The main() method is not involved in testing.
 * 
 * Requirements:
 * •	The balance field must be initialized to Integer.MAX_VALUE when it is declared.
 * •	The processPayment(String) method should decrease the balance field by the 
 *      value of the passed argument.
 */

/* 
Paying bills
*/

public class Solution {
    public static Integer balance;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Current balance: " + balance);
        processPayment(bill);
        System.out.println("Current balance: " + balance);
    }

    public static void processPayment(String bill) {
        //write your code here
    }
}
