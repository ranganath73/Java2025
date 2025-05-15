import org.hibernate.Session;
import org.hibernate.query.Query;

/*
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<String> query = session.createQuery("select distinct department from Employee where age > 18 order by department", String.class);
            query.list().forEach(System.out::println);
        }

    }
}