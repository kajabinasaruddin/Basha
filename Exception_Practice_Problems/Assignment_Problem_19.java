package Exception_Practice_Problems;
public class Assignment_Problem_19 {
    //Using finally with Return Statement: Observe how finally is executed even when a method returns a value.
    public static void main(String[] args) {
            validate();
    }
    public static int validate() {
        try{
            System.out.println("try block::");
            return 1;
        }
        catch (Exception e){
            System.out.println("catch block::");
            return 20;
        }
        finally {
            System.out.println("finally block::");
            return 50;
        }
    }
}
