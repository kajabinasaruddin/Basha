package HackerRank_010;
import java.util.Scanner;
public class Automorphic_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int num=n*n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int mod=(int)Math.pow(10,count);
        if(num%mod == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}