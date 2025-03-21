import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileReadWrite
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //// Reading content from file input.txt ///////
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);

        String fileContent = " ";

        while (scan.hasNext())
        {
            fileContent += " " + scan.next();
        }

        scan.close();

        ///// Writing content of input.txt to output.txt ///////

        Formatter form = new Formatter("output.txt");
        form.format("%s", fileContent);

        form.close();

    }
}