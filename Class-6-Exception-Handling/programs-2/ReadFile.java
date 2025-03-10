import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile
{
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("test.txt");

        if (f.exists()) 
        {
            System.out.println(f.getName() + "Exists");
        }

        Scanner scan = new Scanner(f);

        while (scan.hasNext())
        {
            System.out.print(scan.next() + " ");
        }
    }
}