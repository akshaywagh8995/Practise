public class MultiThreading extends Thread {

    int number = 0;

    void setNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Threads: " + number);
    }

    public static void main(String[] args) {
        for (int i=0; i<15; i++) {
            MultiThreading thread = new MultiThreading();
            thread.setNumber(i+1);
            thread.start();
        }
    }
}
