package Methods_Practice_Problems;
import java.util.Scanner;
public class Print_arm_strong_number_or_not {
    public void isArm(int n){
        int sum=0;
        int temp=n;
        String s=String.valueOf(n);
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(digit,s.length());
            n/=10;
        }
        System.out.println(sum);
        if(temp == sum){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("not ArmStrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print_arm_strong_number_or_not obj=new Print_arm_strong_number_or_not();
        obj.isArm(n);
    }
}