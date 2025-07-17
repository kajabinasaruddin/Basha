package Patterns;
import java.util.Scanner;
public class Inverted_Pyramid_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("-");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=n-i+1;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
