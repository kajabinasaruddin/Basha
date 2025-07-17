package Exception_Practice_Problems;
public class Assignment_Problem_7 {
    //Multiple Exceptions in a Single Catch Block: Handle multiple exceptions
    // of different types in a single catch block using | (Java 7 and above).
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException aai){
            System.out.println(aai);
        }
    }
}
