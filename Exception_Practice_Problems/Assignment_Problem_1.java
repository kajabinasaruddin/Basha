package Exception_Practice_Problems;
// Basic Try-Catch Example: Handle an exception when dividing by zero.
public class Assignment_Problem_1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
       try{
           int result=a/b;
           System.out.println(result);
       }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}