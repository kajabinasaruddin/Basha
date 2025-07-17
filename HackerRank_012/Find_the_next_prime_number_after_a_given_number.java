package HackerRank_012;

import java.util.Scanner;

//Sample Input 0
//11
//Sample Output 0
//13
//Sample Input 1
//100
//Sample Output 1
//101
public class Find_the_next_prime_number_after_a_given_number {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%4==0)
            return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int next=n+1;
        while(!isPrime(next)){
            next++;
        }
        System.out.println(next);
    }
}
