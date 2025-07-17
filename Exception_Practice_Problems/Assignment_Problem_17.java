package Exception_Practice_Problems;
public class Assignment_Problem_17 {
    //OutOfMemoryError: Simulate an OutOfMemoryError by creating large objects or arrays.
    public static void main(String[] args) {
        try {
            int[] a = new int[987654210];
        } catch (OutOfMemoryError o) {
            System.out.println("OutOfMemoryError: " + o);
        }
    }
}