package HackerRank_010;
import java.util.Scanner;
public class Sum_of_Digits_until_Single_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9)
        {
            int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        n=sum;
        }
        System.out.println(n);
    }
}
