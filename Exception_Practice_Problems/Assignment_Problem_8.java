package Exception_Practice_Problems;
public class Assignment_Problem_8 {
    //Handling ArithmeticException: Handle ArithmeticException (e.g., dividing by zero).
    public static void main(String[] args) {
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
    }
}
