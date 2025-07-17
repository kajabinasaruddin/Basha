package Threads_ways_And_Methods;
public class By_using_annonymous_way_Example1 {
    public static void main(String[] args) {
        Thread t=new Thread(){
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.print(i+" ");
            }
        }};
        t.start();
    }
}
