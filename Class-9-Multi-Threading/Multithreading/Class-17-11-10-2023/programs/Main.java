public class Main
{
    public static void main(String[] args) throws IllegalStateException {
        
        
        
        for (int i = 1; i <= 5; i++) {
            NewThread thread = new NewThread(i);
            thread.start();
        }
        // Creating object for Runnable Interface  // This is an anonymous class
        // Runnable r = new Runnable() { //1
        //    public void run() { // 2
        //     for (int i=0; i<5; i++) { //3
        //         System.out.println(i);
        //         try{ // 4
        //             Thread.sleep(1000);
        //         } catch(InterruptedException ie) {} //4
        //     } // 3
        //    } // 2
        // }; // 1



        // Thread t = new Thread(r);
        // for (int i=0; i<3; i++)
        //     t.start();

        // // Thread tr = new Thread(){ public void run() { System.out.println("hello"); } };

        // tr.start();
    }
}