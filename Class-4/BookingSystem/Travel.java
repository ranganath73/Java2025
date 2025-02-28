public class Travel {

    public static void main(String[] args) {
        out:
        do {

            in:
            for (int i = 0; i < 10; i++) {
                System.out.println("Stage " + i + " Crossed!");
                 continue in;
            }
            break out;
        } while(true);
        System.out.println("Getting down on my stage.");
    }
}