package Methods_Practice_Problems;
import java.util.Scanner;
public class Method_with_return_type {
    public static int add(int a,int b){
        //A class can have N number of methods
        //this method returns int type data;
        //public is Access Modifier of this method
        //it is using return keyword to return the data
        //it is non-static method
        return a+b;
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(Method_with_return_type.add(10,20));
        Method_with_return_type obj=new Method_with_return_type();
        obj.sub(20,10);

    }

}
