package Exception_Practice_Problems;
public class Assignment_Problem_5 {
    // Throw Exception: Write a program to throw an exception manually using the throw keyword.
    public static void main(String[] args) {
        try{
            //System.out.println(c);
            throw new ArithmeticException("manually throw the exception");
        }
        catch (ArithmeticException d){
            System.out.println("exception handled::");
        }
    }
}
