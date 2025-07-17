package HackerRank_011;

import java.util.Scanner;

public class Happy_number {
    public static void main(String[] args) {
        /*
            Sample Input 0
            19
            Sample Output
            true
            Explanation
            1^2 + 9^2 = 82 8^2 + 2^2 = 68 6^2 + 8^2 = 100 1^2 + 0^2 + 0^2 = 1 (reaches 1, so it's a happy number)
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       while(n>1 && n!=4){
           int sum=0;
           while(n>0){
               int digit=n%10;
               int b=(int)Math.pow(digit,2);
               sum=sum+b;
               n/=10;
           }
           n=sum;
       }
        System.out.println(n);
       if(n==1){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
    }
}
