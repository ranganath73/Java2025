import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
task1103
*/

public class Solution {
    public static Animal animalGet;
    public static Animal animalLoad;
    public static Animal animalFind;

    public static void main(String[] args) throws Exception {
        Animal animalCat = new Animal();
        animalCat.setName("Murka");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");
        long id = 0;
        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id = (long) session.save(animalCat);
            //write your code here
            Animal animalGet = (Animal) session.get(Animal.class, id + 1);
            Animal animalLoad = (Animal) session.load(Animal.class, id + 1);
            Animal animalFind = (Animal) session.find(Animal.class, id + 1);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(id);
        System.out.println(animalGet == null);
        System.out.println(animalLoad != null);
        System.out.println(animalFind == null);
    }
}