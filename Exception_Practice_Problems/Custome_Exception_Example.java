package Exception_Practice_Problems;
import java.io.InvalidClassException;
class InvalidCuStomException extends Exception{
    String msg;

    public InvalidCuStomException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

public class Custome_Exception_Example {
    public static void main(String[] args) {
        try{
            custom(10,5);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void custom(int a,int b) throws InvalidCuStomException{
        if (a>b){
            System.out.println("A is greater::");
        }else {
            System.out.println("B is greater::");
        }
    }

}