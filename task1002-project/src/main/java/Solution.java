
import org.hibernate.Session;
import org.hibernate.query.Query;

/*
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        // write code here
        Employee result;
        try (Session session = MySessionFactory.getSessionFactory().openSession()){
            Query<Employee> query = session.createQuery("FROM Employee where occupation = 'Director'", Employee.class);
            result = query.uniqueResult();
        }
        return result;
    }
}