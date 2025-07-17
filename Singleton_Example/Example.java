package Singleton_Example;
public class Example {
    public static Example exp;
    private Example(){
    }
    public static Example getInstance(){
        if(exp==null){
            exp=new Example();
        }

        return exp;
    }
    public static void main(String[] args) {
        Example exp;
        exp=Example.getInstance();
    }
}
