package Exception_Practice_Problems;
class MyIllegalArgumentException extends Exception {
    int n;

    public int getN() {
        return n;
    }

    public MyIllegalArgumentException(String message, int n) {
        super(message);
        this.n = n;
    }
}
public class Assignment_Problem_28 {
    public static void main(String[] args) {
        Assignment_Problem_28 obj = new Assignment_Problem_28();
        try {
            String result = obj.validate(-10); // Change to -5 or -4 to test other cases
            System.out.println(result);
        } catch (MyIllegalArgumentException e) {
            System.out.println("Exception handled: " + e.getMessage());
            System.out.println("Invalid input: " + e.getN());
        }
    }
    public String validate(int n) throws MyIllegalArgumentException {
        if (n < 0) {
            if (n % 2 == 0) {
                return "Even number";
            } else {
                return "Odd number";
            }
        } else {
            throw new MyIllegalArgumentException("Invalid input: number must be negative", n);
        }
    }
}
