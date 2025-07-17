package Threads_ways_And_Methods;
public class SetPriority_method extends Thread{
    public static void main(String[] args) {
        System.out.println("current thread old priority::" +currentThread().getPriority());
        currentThread().setPriority(6);
        System.out.println("current thread new priority::" +currentThread().getPriority());
    }
}
