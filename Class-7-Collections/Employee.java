public class Employee {

    private int id;
    public static int count;
    private String name;
    private byte age;
    private double salary;

    public Employee(String name, byte age, double salary) {
        this.id = ++count; // auto-increment functionality
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}