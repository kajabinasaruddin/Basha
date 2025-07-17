package Multi_Thread_Example;
public class By_using_ananemous_way {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        t.start();
    }
}