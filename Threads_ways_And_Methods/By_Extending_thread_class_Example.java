package Threads_ways_And_Methods;
public class By_Extending_thread_class_Example extends Thread{
    public void display(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
    @Override
    public void run() {
        display();
    }
    public static void main(String[] args) {
        By_Extending_thread_class_Example obj=new By_Extending_thread_class_Example();
        obj.start();
    }
}
