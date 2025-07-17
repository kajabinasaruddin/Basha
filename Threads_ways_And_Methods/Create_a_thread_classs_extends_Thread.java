package Threads_ways_And_Methods;
public class Create_a_thread_classs_extends_Thread extends Thread {
    public void EligibleVote(int age){
        if(age>18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public void run(){
        EligibleVote(20);
    }
    public static void main(String[] args) {
        Create_a_thread_classs_extends_Thread obj=new Create_a_thread_classs_extends_Thread();
        Thread th=new Thread(obj);
        th.start();
    }
}
