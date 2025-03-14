/**
 * The Solution class has a list of employees who are 
 * waiting to receive their salary (waitingEmployees), 
 * and a list of employees who already received it (alreadyGotSalaryEmployees). 
 * You need to implement the paySalary(String) method whose 
 * input parameter is the name of an employee who wants to receive his or her salary.
 * 
 * The method should check whether the employee is in the waitingEmployees list. 
 * If the employee did not receive his or her salary, then pay it:
 * If the paySalary(String) method's input parameter is null, then don't do anything.
 * Add the employee's name to the alreadyGotSalaryEmployees list.
 * 
 * In the waitingEmployees list, replace the employee's name with null.
 * 
 * Requirements:
 * •	The paySalary(String) method should add the employee's name to the 
 *      alreadyGotSalaryEmployees list if it exists in the waitingEmployees list.
 * •	The paySalary(String) method should replace the employee's name 
 *      with null if it exists in the waitingEmployees list.
 * •	The paySalary(String) method should not modify the waitingEmployees 
 *      and alreadyGotSalaryEmployees lists if the passed name is 
 *      not present in the waitingEmployees list.
 * •	If null is passed to the paySalary(String) method, the method 
 *      should not add null to the waitingEmployees or alreadyGotSalaryEmployees list.
 */

import java.util.ArrayList;

/* 
Accounting department
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //write your code here
    }
}



// public class Solution {
//     public static ArrayList<String> waitingEmployees = new ArrayList<>();
//     public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

//     public static void initEmployees() {
//         waitingEmployees.add("Doc");
//         waitingEmployees.add("Grumpy");
//         waitingEmployees.add("Happy");
//         waitingEmployees.add("Sleepy");
//         waitingEmployees.add("Bashful");
//         waitingEmployees.add("Sneezy");
//         waitingEmployees.add("Dopey");
//     }

//     public static void main(String[] args) {
//         initEmployees();
//     }

//     public static void paySalary(String name) {
//         if (name == null) {
//             return;
//         }
//         for (int i = 0; i < waitingEmployees.size(); i++) {
//             if (waitingEmployees.get(i) == name) {
//                 alreadyGotSalaryEmployees.add(name);
//                 waitingEmployees.set(i, null);
//             }
//         }
//     }
// }
