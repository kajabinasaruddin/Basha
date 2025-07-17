package Exception_Practice_Problems;
public class Assignment_Problem_18 {
    // Handling Multiple Exceptions in Nested Try-Catch:
    // Nest multiple try-catch blocks to handle different exceptions at different levels.
    public static void main(String[] args) {
        try{
            try{
                int[] array=new int[5];
                array[10]=100;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
