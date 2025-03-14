import java.util.ArrayList;

public class Traversal
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        for (String l : list)
        {
            System.out.println(l);
        }
    }
}