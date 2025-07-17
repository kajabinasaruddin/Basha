package Threads_ways_And_Methods;
public class GetPriority_method extends Thread{
    public void run(){
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("current thread of old priority::" + currentThread().getPriority());
    }
}
