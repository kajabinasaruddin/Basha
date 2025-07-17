package Threads_ways_And_Methods;
public class By_using_annonymous_Example2 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    System.out.print(i+" ");
                }
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
