import org.hibernate.Session;
import org.hibernate.query.Query;


import java.util.List;

/*
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;
        //write your code here
        try (Session session = MySessionFactory.getSessionFactory().openSession()){
            Query<Book> query = session.createQuery("from Book b where author.fullName = 'Mark Twain' and publisher.name = 'Chatto & Windus'", Book.class);
            books = query.list();
        }
        books.forEach(System.out::println);
    }
}