package Exception_Practice_Problems;
public class Assignment_Problem_11 {
    //ClassCastException: Demonstrate ClassCastException when trying
    // to cast an object of one type to another incompatible type.
    public static void main(String[] args) {
        Object obj=new Object();
        try{
            String name=(String) obj;
            System.out.println(name);
        }
        catch (ClassCastException c){
            System.out.println("exception handled");
        }
    }
}
