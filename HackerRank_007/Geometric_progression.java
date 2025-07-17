package HackerRank_007;

import java.util.Scanner;

public class
Geometric_progression {
    public static void main(String[] args) {
        /* Sum = 𝑎 × ((𝑟^n −1)/(𝑟−1))
        Sample Input  2 3 4
        Sample Output
        80
        Explanation :The sequence is 2, 6, 18, 54. The sum of these terms is 80.*/
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float r=sc.nextFloat();
        int n=sc.nextInt();
        int sum=0;
        sum+=(int)(a * (Math.pow(r, n) - 1) / (r - 1));
        System.out.println(sum);
    }
}
