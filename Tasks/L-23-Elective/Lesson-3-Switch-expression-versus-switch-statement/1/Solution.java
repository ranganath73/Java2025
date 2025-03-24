/**
 * The Solution class has a getShapeNameByCountOfCorners(int) method that 
 * returns the name of a polygon depending on the number of its corners. 
 * Your task is to rewrite the method using only a switch statement.
 *
 * Requirements:
 * •	The result of the getShapeNameByCountOfCorners(int) method should not change.
 * •	Only a switch statement should be used in the getShapeNameByCountOfCorners(int) method.
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCornerCount(3));
        System.out.println(getShapeNameByCornerCount(5));
        System.out.println(getShapeNameByCornerCount(1));
    }

    public static String getShapeNameByCornerCount(int cornerCount) {
        String shape;
        if (cornerCount == 3) {
            shape = "Triangle";
        } else if (cornerCount == 4) {
            shape = "Quadrangle";
        } else if (cornerCount == 5) {
            shape = "Pentagon";
        } else if (cornerCount == 6) {
            shape = "Hexagon";
        } else if (cornerCount == 7) {
            shape = "Heptagon";
        } else if (cornerCount == 8) {
            shape = "Octagon";
        } else {
            shape = "Other shape";
        }
        return shape;
    }
}
