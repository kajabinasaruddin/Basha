package Threads_ways_And_Methods;
public class By_Implementing_the_runnable_interface_Example implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        By_Implementing_the_runnable_interface_Example obj=new By_Implementing_the_runnable_interface_Example();
        Thread tr=new Thread(obj);
        tr.start();
    }
}
