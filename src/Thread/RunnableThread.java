package Thread;

public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started...");
        NewThread ob1 = new NewThread(1);
        NewThread ob2 = new NewThread(2);
        System.out.println("Thread 1 is alive: "+ob1.t.isAlive());
        System.out.println("Thread 2 is alive: "+ob2.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread 1 is alive: "+ob1.t.isAlive());
        System.out.println("Thread 2 is alive: "+ob2.t.isAlive());

        System.out.println("Main Thread Exited...");
    }
}
