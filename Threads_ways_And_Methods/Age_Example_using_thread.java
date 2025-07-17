package Threads_ways_And_Methods;
public class Age_Example_using_thread extends Thread{
    public void evenNumber(int age){
        for (int i=2;i<=100;i++) {
            if (age % 2 == 0) {
                System.out.print(i+" ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
    public void run(){
        evenNumber(2);
    }
    public static void main(String[] args) throws InterruptedException {
        Age_Example_using_thread obj=new Age_Example_using_thread();
        obj.start();
        Thread.sleep(2000);

    }
}
