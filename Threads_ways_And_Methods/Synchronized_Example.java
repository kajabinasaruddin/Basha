package Threads_ways_And_Methods;
public class Synchronized_Example extends Thread {
    public void run(){
        display();
    }
    public synchronized void display() {
        System.out.println("completed");
    }
    public static void main(String[] args) {
        Synchronized_Example b=new Synchronized_Example();
        b.start();
    }
}