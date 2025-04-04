public class Account {

    private double balance;  // Member variable or Property or Data Member

    // public Account() {}

    public Account(double balance) { // Banker's portion
        // this.balance = balance;
        setBalance(balance);
    }

    public double getBalance() {   /// Users
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {    // without return type and with argument
        balance = amount;

        System.out.println("Money has been deposited. -> Balance : " + balance);
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            System.out.println("Recieve the amount : " );
            System.out.println("The  current balance is : " + (balance - amount));
        }

    }

}