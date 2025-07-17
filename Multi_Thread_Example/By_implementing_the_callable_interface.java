package Multi_Thread_Example;
import java.util.concurrent.*;
public class By_implementing_the_callable_interface implements Callable {
    @Override
    public Integer call() throws Exception {
        return add();
    }
    public int add() {
        int a = 10;
        int b = 20;
        return a + b;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<Integer>f = es.submit(new By_implementing_the_callable_interface());
        System.out.println(f.get());
    }
}