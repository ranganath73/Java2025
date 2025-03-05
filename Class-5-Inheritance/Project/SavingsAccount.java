public class SavingsAccount extends Account {

    public SavingsAccount(double amount) {
        super(amount);
        // super.withdraw();
    }

    
    public void withdrawSavings(double amount) {  // Run time polymorphism
        if (super.getBalance() < amount) {
             System.out.println("Insufficient Balance!");
         } else {
             System.out.println("Recieve the amount : " );
             withdraw(amount);
         }
    }



}