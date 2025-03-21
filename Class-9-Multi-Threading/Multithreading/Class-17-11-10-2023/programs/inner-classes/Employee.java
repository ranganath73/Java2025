public class Employee
{
    public static String name;
    private int age;

    
    static class Inner{

        public String getNameFromInner(){
            return name;
        }
    }
}