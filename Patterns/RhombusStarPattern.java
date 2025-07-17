package Patterns;
import java.util.Scanner;
public class RhombusStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("-");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<n-i;l++){
                System.out.print("*");
            }
            for(int m=1;m<=i;m++){
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
