package Multi_Thread_Example;
public class By_extends_thread_class extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new By_extends_thread_class();
        t1.start();
        //System.out.println("done");
        Thread t2 = new By_extends_thread_class();
        t2.start();
        //System.out.println("completed");
    }
}