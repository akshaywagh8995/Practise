class MyThread2 extends  Thread{

    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Name "+ Thread.currentThread().getName() + " Priority "+ Thread.currentThread().getPriority() + " count " + i);
            Thread.yield(); // to yield to other threads to give them chance to run
            try {
             Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2( "MyThread2 T1");
        MyThread2 t2 = new MyThread2( "MyThread2 T2");
        t1.start();
        t2.start();
        //t2.interrupt();  this will help to kill the thread and free up the resource
    }
}
