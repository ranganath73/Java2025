public class Biggest {

    public static void main(String[] args) {
        
        int a = 10, b = 20, c = 45, bigger, biggest;

        bigger = (a > b) ? a : b;

        biggest = (bigger > c) ? bigger : c;

        System.out.println(biggest);
    }
}