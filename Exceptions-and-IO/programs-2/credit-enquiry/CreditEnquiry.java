import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditEnquiry
{
    public final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args)
    {
        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END)
        {
            switch (accountType)
            {
                case ZERO_BALANCE:
                    System.out.println("Account with zero balances:");
                    break;
                case CREDIT_BALANCE:
                    System.out.println("Account with credit balances:");
                    break;
                case DEBIT_BALANCE:
                    System.out.println("Account with debit balances:");
                    break;
            }

            readRecords(accountType);
            accountType = getRequest();
        }
    }

    private static MenuOption getRequest()
    {
        int request = 4;

        System.out.println("\n1 - List account with zero balances \n2 - List account with credit balances\n3 - List account with debit balances\n4 - Terminating program");

        try {
            Scanner input = new Scanner(System.in);

            do
            {
                System.out.print("\n? ");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch(NoSuchElementException noSuchElementException)
        {
            System.err.println("Invalid input. Terminating");
        }
        return choices[request - 1];
    }

    private static void readRecords(MenuOption accountType)
    {
        try (Scanner input = new Scanner(Paths.get("clients.txt")))
        {
            while (input.hasNext())
            {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                if(shouldDisplay(accountType, balance))
                  System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                         firstName, lastName, balance);
                else
                   input.nextLine(); // discord the rest of the current record
            }
        } catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOption accountType, double balance)
    {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
            return true;

        return false;
    }
}