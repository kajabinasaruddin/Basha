package Exception_Practice_Problems;
public class Assignment_Problem_2 {
    //Multiple Catch Blocks: Handle multiple exceptions using multiple catch blocks
    // (e.g., divide by zero, null pointer, and array index out of bounds).
    public static void main(String[] args) {
//        int a=10;
//        int b=0;
        try{
//            int result=a/b;
//            System.out.println(result);
            String str = null;
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("Airthmetic Error:"+ e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Array Error:" +ae.getMessage());
        }
        catch (NullPointerException n){
            System.out.println("null pionter error:" +n.getMessage());
        }
    }
}
