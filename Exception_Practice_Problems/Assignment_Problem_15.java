package Exception_Practice_Problems;
import java.util.Scanner;
class MyCustomException extends Exception{
    int age;
    public MyCustomException(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class Assignment_Problem_15 {
    public static void main(String[] args) {
        //Custom Exception with Messages: Create a custom exception that passes error messages and display them when caught
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
            eligible(a);
        }
        catch (Exception e){
            System.out.println("exceptiion handled::");
        }
    }
    public static void eligible(int age) throws MyCustomException{
        if(age>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
