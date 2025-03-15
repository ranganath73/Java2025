import java.io.FileNotFoundException;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileWriter
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Formatter file = new Formatter("C:\\MyDrives\\work\\iSoft\\Java\\Class-8-Exceptions-IO\\Class-16-10-10-2023\\abc\\testprogram.py");
    // C:\E-Drive\Venkat\infycle\Class-7-Exceptions-IO\Class-16-10-10-2023\test
    // C:\MyDrives\work\iSoft\Java\Class-8-Exceptions-IO\Class-16-10-10-2023\abc
        file.format("%s %s %s", "1","John","Doe\n");
        file.format("%s %s %s", "2","Peter","Hein\n\r");

        file.close();

        File f = new File("program.py");
        Scanner scan = new Scanner(f);

        while (scan.hasNext())
        {
            System.out.print(scan.next() + " ");
        }
        scan.close();
    }
}