import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class WriteFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Formatter format = new Formatter("NewFile.py");

        format.format("%s %s %s", "1", "John", "Doe");

        format.close();

        File f = new File("NewFile.py");

        Scanner scan = new Scanner(f);
        while(scan.hasNext())
        {
            System.out.println(scan.next());
        }
        scan.close();
    }
}