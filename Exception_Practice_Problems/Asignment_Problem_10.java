package Exception_Practice_Problems;
public class Asignment_Problem_10 {
    //ArrayIndexOutOfBoundsException: Handle ArrayIndexOutOfBoundsException by accessing an invalid index in an array.
    public static void main(String[] args) {
        try{
            int[] array={1,2,3,4,5};
            System.out.println(array[20]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
    }
}
