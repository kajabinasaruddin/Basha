package Exception_Practice_Problems;
public class Assignment_Problem_14 {
    //NumberFormatException: Handle NumberFormatException when trying to convert a non-numeric string to an integer.
    public static void main(String[] args) {
        String name="alice";
        try{
            int num=Integer.parseInt(name);
            System.out.println(num);
        }
        catch (NumberFormatException n){
            System.out.println(n);
        }
    }
}
