package Threads_ways_And_Methods;
public class SetName_method extends Thread{
    public void run(){
        System.out.println("alice");
    }
    public static void main(String[] args) {
        System.out.println(currentThread().getName());
        currentThread().setName("new name");
        System.out.println(currentThread().getName());
        SetName_method sn=new SetName_method();
        //sn.start();
        //sn.getName();
        sn.setName("bob");
        System.out.println(sn.getName());
    }
}