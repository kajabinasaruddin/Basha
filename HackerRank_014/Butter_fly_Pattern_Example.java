package HackerRank_014;
import java.util.Scanner;
public class Butter_fly_Pattern_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}