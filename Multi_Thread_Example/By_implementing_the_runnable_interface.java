package Multi_Thread_Example;
public class By_implementing_the_runnable_interface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
    public static void main(String[] args) {
        Runnable b = new By_implementing_the_runnable_interface();
        Thread obj = new Thread(b);
        obj.start();
        //System.out.println("completed");
        Thread t2 = new Thread(b);
        t2.start();
    }
}