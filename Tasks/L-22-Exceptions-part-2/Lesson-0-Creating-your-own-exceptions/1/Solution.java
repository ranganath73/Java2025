/**
 * Let's implement a date validator. 
 * The date format is dd.mm.yyyy, where dd is the number of the day in the month, 
 * mm is the number of the month in the year, yyyy is the year.
 *
 * The checkDateFormat(String) method checks the date, 
 * and if the date does not match the format, then the method should throw an InvalidDateFormatException.
 * If the format is correct, then check the year, month, and day in the checkYearValue, 
 * checkMonthValue and checkDayValue methods, respectively:
 *
 * the year must be in the range from 1900 to 2100 inclusive, 
 * otherwise throw an InvalidYearValueException;
 * the month must be in the range from 1 to 12 inclusive, otherwise throw an InvalidMonthValueException;
 * the day must be in the range from 1 to the maximum value of the day in the given month 
 * (see the months map) inclusive, otherwise we throw an InvalidDayValueException.
 * These exceptions must be created in separate classes (files) and inherit RuntimeException.
 *
 * Example of a valid date: 31.05.1900, 28.02.2100, 01.01.2000, 30.11.2021, 15.09.1999.
 * Examples of invalid dates: 32.05.1900, 28.02.2101, 30.01.1874, 30.02.2021, 150.09.1999, 
 * 05.111.2046, 15.91.1967, 150.09.19999.
 *
 * Requirements:
 * •	Do not change the signature or return type of the checkDateFormat(String) method.
 * •	Do not change the signature or return type of the checkYearValue(String) method.
 * •	Do not change the signature or return type of the checkMonthValue(String) method.
 * •	Do not change the signature or return type of the checkDayValue(String) method.
 * •	The public InvalidDateFormatException class must be in a separate file and 
 *      inherit the RuntimeException class.
 * •	The public InvalidYearValueException class must be in a separate file and inherit 
 *      the RuntimeException class.
 * •	The public InvalidMonthValueException class must be in a separate file and inherit 
 *      the RuntimeException class.
 * •	The public InvalidDayValueException class must be in a separate file and inherit 
 *      the RuntimeException class.
 * •	The checkDateFormat() method must be implemented as outlined in the task conditions.
 * •	The checkYearValue() method must be implemented as outlined in the task conditions.
 * •	The checkMonthValue() method must be implemented as outlined in the task conditions.
 * •	The checkDayValue() method must be implemented as outlined in the task conditions.
 */

/* 
Date validator
*/

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in the format dd.mm.yyyy: ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nThe date is valid.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        //write your code here
    }

    public static void checkYearValue(String date) {
        //write your code here
    }

    public static void checkMonthValue(String date) {
        //write your code here
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>(){{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        //write your code here
    }
}
