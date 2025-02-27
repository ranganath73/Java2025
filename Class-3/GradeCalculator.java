/**
 *  marks  90 - 100 - A
 *  marks  80 - 90 B
 *  marks  70 - 80   C
 *  marks  60 - 70 D
 *  marks  50 - 60 E
 */

public class GradeCalculator {

    public static void main(String[] args) {
        
        int marks = 1000;

        if (marks > 90) {
            System.out.println("A");
        } else if (marks > 80) {
            System.out.println("B");
        } else if (marks > 70) {
            System.out.println("C");
        } else  if (marks > 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        
    }
}