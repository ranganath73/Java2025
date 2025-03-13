import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {

        // HashMap<K, V> 

        HashMap<Integer, String> hotel = new HashMap<>();

        hotel.put(123, "Raja");
        hotel.put(527, "Peter");
        hotel.put(536, "John");
        hotel.put(781, "Jockey");
        hotel.put(123, "Rahim");

        System.out.println(hotel);
    }
}