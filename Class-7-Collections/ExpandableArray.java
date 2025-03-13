import java.util.ArrayList;

public class ExpandableArray {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>(); // Default size is : 10
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Default size is : 10

        numbers.add(1);
        
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add(1, "Orange");

        System.out.println(colors);
        System.out.println(colors.set(2, "yellow"));

        System.out.println(colors.get(2));
        colors.remove("green");
        System.out.println(colors);
        System.out.println(colors.size());
    }
}