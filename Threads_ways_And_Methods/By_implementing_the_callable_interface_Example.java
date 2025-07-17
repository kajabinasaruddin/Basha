package Threads_ways_And_Methods;
import java.util.concurrent.*;
public class By_implementing_the_callable_interface_Example implements Callable{
    public By_implementing_the_callable_interface_Example() {
    }
    @Override
    public String call() throws Exception {
        return "khajabhi";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(50);
        Future<Integer> ft = es.submit(new By_implementing_the_callable_interface_Example());
        System.out.println(ft.get());
    }
}
