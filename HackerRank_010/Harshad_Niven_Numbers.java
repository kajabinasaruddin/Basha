package HackerRank_010;
import java.util.Scanner;
public class Harshad_Niven_Numbers {
    public static void main(String[] args) {
        //18
        //Sample Output 0
        //
        //true
        //Explanation 0
        //
        //Sum of digits of 18 = 1 + 8 = 9, and 18 is divisible by 9
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n/=10;
        }
        if(temp%sum == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
