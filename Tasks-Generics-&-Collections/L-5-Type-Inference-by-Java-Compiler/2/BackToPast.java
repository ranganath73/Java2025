/**
 * The Solution class has an intArray field, a corresponding getter and setter, and a main method with variables declared in it. You need to replace the types of the var variables with specific types of objects (do not change the names and initialization of the objects). Also, fix the getter and setter for the intArray field.

Example:
var console = new Scanner(System.in);
Replace with:
Scanner console = new Scanner(System.in);

Requirements:
•	Replace the var variables' types with a specific types of objects.
•	Fix the getter and setter for the intArray field.
 */


/* 
Back to the past
*/

public class Solution {
    private var intArray = new int[4];

    public var getIntArray() {
        return intArray;
    }

    public void setIntArray(var intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        var string = new String("Hello");
        var stringBuilder = new StringBuilder();
    }
}
