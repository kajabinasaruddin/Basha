package Exception_Practice_Problems;
import java.util.Scanner;
class InvalidNegativeException extends Exception{
    int a;
    public InvalidNegativeException(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
}
public class Assignment_Problem_4 {
    //Custom Exception: Create a custom exception class to check for negative values.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value::");
        int a=sc.nextInt();
        try{
            negative(a);
        }
        catch (Exception e){
            System.out.println("exception handled::" +e);
        }
    }
    public static void negative(int a) throws InvalidNegativeException{
        if(a<0){
            System.out.println(a+" negative value");
        }
        else{
            System.out.println(a+" positive value");
        }
    }
}
