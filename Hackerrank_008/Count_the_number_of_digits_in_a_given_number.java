package Hackerrank_008;
import java.util.Scanner;
public class Count_the_number_of_digits_in_a_given_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        if(count==0){
            count=1;
        }
        System.out.println(count);
    }
}
