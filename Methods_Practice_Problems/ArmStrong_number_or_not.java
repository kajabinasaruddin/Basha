package Methods_Practice_Problems;
import java.util.Scanner;
public class ArmStrong_number_or_not {
    public int isArmstrong(int n){
        String count=String.valueOf(n);
        int count1=count.length();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(digit,count1);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArmStrong_number_or_not obj=new ArmStrong_number_or_not();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( obj.isArmstrong(n));
    }
}
