/**
 * The getChildrenCount(Human) method throws a NPE (NullPointerException), 
 * but it is not very informative.
 *
 * Create a ChildrenNotInitializedException in a separate class and make it inherit RuntimeException. 
 * Also create a constructor for this class with a String parameter. 
 * Make the constructor display its parameter on the screen.
 *
 * Catch the NPE in a try-catch block and throw your custom ChildrenNotInitializedException, 
 * passing the message field to the constructor.
 *
 * Requirements:
 * •	Do not change the signature or return type of the getChildrenCount(Human) method.
 * •	The public ChildrenNotInitializedException class must be in a separate file and 
 *      inherit the RuntimeException class.
 * •	The ChildrenNotInitializedException class must have a constructor with a String 
 *      parameter that gets displayed by the constructor.
 * •	The getChildrenCount method must be implemented as outlined in the task conditions.
 * •	Don't change the Human class.
 */

/* 
Custom exception
*/

import java.util.ArrayList;

public class Solution {
    public static final String message = "The Human object's list of children appears to be uninitialized.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Name: %s, age: %d, number of children: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Name: %s, age: %d, number of children: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        //write your code here
        size = human.getChildren().size();

        return size;
    }
}
