package Hackerrank_008;
import java.util.Scanner;
public class Co_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        boolean flag=true;
        while(b !=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        if(flag){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}
