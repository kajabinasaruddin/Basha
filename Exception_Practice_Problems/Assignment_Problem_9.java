package Exception_Practice_Problems;
public class Assignment_Problem_9 {
    //Handling NullPointerException: Handle NullPointerException (e.g., accessing a method on a null object).
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        }
        catch (NullPointerException n){
            System.out.println("NullPointerException:" + n.getMessage());
        }
    }
}
