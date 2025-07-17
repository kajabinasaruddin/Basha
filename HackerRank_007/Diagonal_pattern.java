package HackerRank_007;

import java.util.Scanner;

public class Diagonal_pattern {
    /*
    Sample Input 5
    Sample Output 0
 1
 2
  3
   4
    5
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i == j) {
                    System.out.print(nums+"");
                    nums++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
