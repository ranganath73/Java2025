class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        // Thread anotherThread = new AnotherThread();
        // anotherThread.start();

        System.out.println("Hello again from the main thread.");

        // anotherThread.start();  => It creates an error.
        // So we can replace it with an anonymous class.

        new Thread() {
            public void run(){
                System.out.println("Hello from anonymous class thread.");
            }
        }.start();
    }
}
