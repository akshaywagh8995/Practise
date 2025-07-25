public class MultiThreadingRunnable implements Runnable {

    int number = 0;

    void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Threads: " + number);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultiThreadingRunnable runnable = new MultiThreadingRunnable();
            runnable.setNumber(i);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
