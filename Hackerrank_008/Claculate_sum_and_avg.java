package Hackerrank_008;
import java.util.Scanner;
public class Claculate_sum_and_avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n/=10;
        }
        System.out.println(sum);
    }
}
