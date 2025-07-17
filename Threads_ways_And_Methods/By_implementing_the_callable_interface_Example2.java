package Threads_ways_And_Methods;
import java.util.concurrent.*;
public class By_implementing_the_callable_interface_Example2 implements Callable {
    @Override
    public String call() throws Exception {
        return "alice";
    }
    public static  void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(50);
        Future<Integer>f=es.submit(new By_implementing_the_callable_interface_Example2());
        System.out.println(f.get());
    }
}