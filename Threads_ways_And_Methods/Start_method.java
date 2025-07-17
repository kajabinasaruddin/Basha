package Threads_ways_And_Methods;
public class Start_method extends Thread{
    @Override
    public void run() {
        System.out.println("alice");
    }
    public static void main(String[] args) {
        Start_method sm=new Start_method();
        sm.start();
    }
}