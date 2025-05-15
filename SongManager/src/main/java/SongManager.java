
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SongManager {
    public static void main(String[] args) {
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        // Create session factory and auto-close with try-with-resources
        try  {
            // initialize session object


            Song song1 = new Song();
            song1.setSongName("How to name it");
            song1.setArtist("Ilayaraja");

            session.beginTransaction();

            // Here we used
            // persist() method of JPA
            session.persist(song1);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
