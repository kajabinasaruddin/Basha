package Exception_Practice_Problems;
public class Assignment_Problem_3 {
    //3. Try-Catch-Finally: Demonstrate the execution of the finally block even after an exception is thrown.
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        finally {
            System.out.println("finally block aklways excuted");
        }
    }
}
