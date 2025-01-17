package Thread;

public class NewThread implements Runnable{
    Thread t;
    int threadNo;

    NewThread(int threadNo) {
        t = new Thread(this, "Runnable Thread 1");
        this.threadNo = threadNo;
        t.start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println( threadNo+ "-Child Thread: "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadNo+ "-Child Thread Interrupted");
            }
        }
        System.out.println("Exiting Child Thread...");
    }
}
