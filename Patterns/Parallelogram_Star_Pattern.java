package Patterns;
import java.util.Scanner;
public class Parallelogram_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n+2;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
