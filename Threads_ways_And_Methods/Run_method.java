package Threads_ways_And_Methods;
public class Run_method extends Thread {
    public void run(){
        System.out.println("alice");
    }
    public static void main(String[] args) {
        Run_method rm=new Run_method();
        rm.start();
    }
}
