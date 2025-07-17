package Threads_ways_And_Methods;
public class GetId_method extends Thread{
    public static void main(String[] args) {
        System.out.println(currentThread().getId());
    }
}
