package Exception_Practice_Problems;
public class Assignment_Problem_26 {
    // Rethrowing Exceptions: Catch an exception and rethrow it for further handling in higher layers.

    public static void main(String[] args) {
        try {
            rethrows();
        } catch (ArithmeticException ae) {
            System.out.println("Handled in main: " + ae.getMessage());
        }
    }
    public static void rethrows() {
        try {
            int result = rethrow(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("rethrows: " + e.getMessage());
            throw e;
        }
    }
    public static int rethrow(int a, int b) {
        return a / b;
    }
}
