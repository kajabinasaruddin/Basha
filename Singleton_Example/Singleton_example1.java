package Singleton_Example;
public class Singleton_example1 {
    private static Singleton_example1 obj;
    private Singleton_example1(){}
    public static Singleton_example1 getInstance(){
        if(obj==null){
            obj=new Singleton_example1();
        }
        return obj;
    }
    public void main(){
        System.out.println("alice");
    }
    public static void main(String[] args) {
        Singleton_example1 obj=new Singleton_example1();
        obj.main();
    }
}