/**
 * The task is simple: disassemble a tower of champagne glasses using the removeGlassesReverse method. This method should take off each layer, starting from the top (from the end of the list). You need to implement this method.
The main method will help with testing.
Try running the program and look at the output.

Requirements:
•	The Solution class should have a public static removeGlassesReverse(ArrayList<String>) method.
•	The removeGlassesReverse method should remove all elements from the passed list, starting from the end (call the remove(int) method on the list).
 */



import java.util.ArrayList;

/* 
Disassembling a tower of champagne glasses
*/

public class Solution {

    private static ArrayList<String> initList() {
        String topLayer = "       🍷       ";
        String secondLayer = "      🍷🍷      ";
        String thirdLayer = "     🍷🍷🍷     ";
        String fourthLayer = "    🍷🍷🍷🍷    ";
        String fifthLayer = "   🍷🍷🍷🍷🍷   ";
        String sixthLayer = "  🍷🍷🍷🍷🍷🍷  ";
        String seventhLayer = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String eighthLayer = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(eighthLayer);
        list.add(seventhLayer);
        list.add(sixthLayer);
        list.add(fifthLayer);
        list.add(fourthLayer);
        list.add(thirdLayer);
        list.add(secondLayer);
        list.add(topLayer);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Starting to disassemble the tower...");

        //write your code here

        if(glasses.size() == 0) {
            System.out.println("The tower is disassembled!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
