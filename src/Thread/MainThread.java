package Thread;

public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread"+t);
        t.setName("My Thread");
        System.out.println("After Change Thread Name"+t);

        for (int i = 10; i>0; i--){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
