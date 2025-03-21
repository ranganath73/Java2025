public class Main
{
    public static void main(String[] args)
    {
        Employee.Inner inner = new Employee.Inner();

        Employee.name = "Raja";

        System.out.println(inner.getNameFromInner());
    }
}