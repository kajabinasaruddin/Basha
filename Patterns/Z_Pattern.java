package Patterns;

import java.util.Scanner;

public class Z_Pattern {
    public static void main(String[] args) {
        /*
        Example:
        1) Input : n=3
        Output:
***
 *
***

2) Input n=4
Output:
****
  *
 *
****
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }
                else if(i==1 && j==n-1){
                    System.out.print("*");
                }
                else if(i==2 && j==n-2){
                    System.out.print("*");
                }
                else if(i==3 && j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
