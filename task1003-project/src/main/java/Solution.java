import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/*
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        //write your code here
        try (Session session = MySessionFactory.getSessionFactory().openSession()){
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("update Employee set smth = concat('senior ', smth)", Employee.class);
            query.executeUpdate();
            tx.commit();
        }
    }
}