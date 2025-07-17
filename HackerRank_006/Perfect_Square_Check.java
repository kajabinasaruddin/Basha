package HackerRank_006;
import java.util.Arrays;
import java.util.Scanner;
public class Perfect_Square_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt=(int)Math.sqrt(n);
        System.out.println(sqrt);
        int sum=0;
        for(int i=1;i*i<=n;i++) {
            sum=sum+1;
        }
        System.out.println(sum);
        if(sum==sqrt){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}