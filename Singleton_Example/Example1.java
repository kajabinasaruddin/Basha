package Singleton_Example;
public class Example1 {
    private static Example1 obj;
    private Example1(){
    }
    public static Example1 getInstance(){
        if(obj==null){
            obj=new Example1();
        }
        return obj;
    }
    public static void main(String[] args) {
        Example1 exp;
        exp=Example1.getInstance();
    }
}
