import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ReadingAndWriting
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File input = new File("input.txt");
        Scanner scan = new Scanner(input);

        int num = 0;
        while (scan.hasNext())
        {
            num += Integer.parseInt(scan.next());
        }
        scan.close();

        Formatter f = new Formatter("output.txt");
        f.format("%s", num);
        f.close();
    }
}