/// This class explains lifecycle methods of Thread class

class MyThread  extends  Thread{

    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread st = new MyThread(); // NEW
        System.out.println(st.getState());
        st.start(); // RUNNABLE
        System.out.println(st.getState());
        //st.sleep(100);
        Thread.sleep(100);// TIMED_WAITING
        System.out.println(st.getState());
        st.join(); // TERMINATED // it waits for st thread to die
        System.out.println(st.getState());
    }
}
