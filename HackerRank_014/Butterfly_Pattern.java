package HackerRank_014;
import java.util.Scanner;
public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            for(int l=1;l<=n-i;l++)
                System.out.print(" ");
            for(int m=1;m<=i;m++)
                System.out.print("*");
            System.out.println("");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            for (int l = 1; l <= n - i; l++)
                System.out.print(" ");
            for (int m = 1; m <= i; m++)
                System.out.print("*");
            System.out.println();
        }
    }
}
