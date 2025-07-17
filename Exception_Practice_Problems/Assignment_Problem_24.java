package Exception_Practice_Problems;
//Handling Input Mismatch Exception: Handle InputMismatchException when reading a non-integer value using Scanner.

import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment_Problem_24 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        byte n=s.nextByte();
        if(n>=-128 && n<=128)
        try{
            System.out.println("Exception handled::");
        } catch (InputMismatchException e) {
            System.out.println("Exception handling code::");
        }
    }
}
