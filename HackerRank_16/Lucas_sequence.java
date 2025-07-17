package HackerRank_16;

import java.util.Scanner;
//Sample Input 0
//5
//Sample Output 0
//11
//Explanation 0
//L(0) = 2 L(1) = 1 L(2) = L(1) + L(0) = 1 + 2 = 3 L(3) = L(2) + L(1) = 3 + 1 = 4 L(4) = L(3) + L(2) = 4 + 3 = 7 L(5) = L(4) + L(3) = 7 + 4 = 11
public class Lucas_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        else if(n==0){
            System.out.println(2);
            return ;
        }
        int[] dp=new int[n+1];
         dp[0]=2;
         dp[1]=1;
        for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);

    }
}
