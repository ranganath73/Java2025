public class CurrentAccount extends Account {

    public CurrentAccount(double amount) {
        super(amount);
    }

    // OverDraft
    public void withdraw(double amount) {
        System.out.println("The Overdraft amount taken is: " + (balance - amount));
    }
}