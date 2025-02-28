public class Customer {

    private String name;

    private String address;

    private Account account;

    public Customer() {
        this.name = "name";
        this.address = "address";
        this.account = null;
    } 

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String address) {
        this(name);
        this.address = address;
    }

    public Customer(String name, String address, Account account) {
        this(name, address);
        account = new Account(10000);
    }
}