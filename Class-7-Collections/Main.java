public class Main {

    static {
        System.out.println("I am printing first");
    }

    public static void main(String[] args) {

        Employee shyam = new Employee("Shyam",(byte) 25, 100000);
        Employee rahul = new Employee("Rohul",(byte) 26, 100000);
        Employee Keerthi = new Employee("Keerthi",(byte) 23, 100000);

        System.out.println(shyam.getId() + " " + shyam.getName() + " " + shyam.getAge() + " " + shyam.getSalary());
        System.out.println(Employee.count);
        System.out.println(rahul.getId() + " " + rahul.getName() + " " + rahul.getAge() + " " + rahul.getSalary());
        System.out.println(Employee.count);
        System.out.println(Keerthi.getId() + " " + Keerthi.getName() + " " + Keerthi.getAge() + " " + Keerthi.getSalary());
        System.out.println(Employee.count);

        System.out.println(shyam.getClass());

        double value = 10;

        System.out.println(0.0/5);

        class Animal<T> {
            
        } 

    }
}