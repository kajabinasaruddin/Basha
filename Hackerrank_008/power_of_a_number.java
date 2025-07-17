package Hackerrank_008;
import java.util.Scanner;
public class power_of_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int c=(int)Math.pow(x,n);
        System.out.println(c);
    }
}
