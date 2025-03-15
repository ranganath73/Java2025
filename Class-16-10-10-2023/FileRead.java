import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileRead
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("test.txt");
        Scanner input = new Scanner(f);

        if (f.exists())
        {
            // System.out.println(f.getName() + " The file Exists");
            while (input.hasNext())
            {
                System.out.print(input.next()+ " ");
            }


        } else {
            System.out.println("Not exist.");
        }
    }
}
