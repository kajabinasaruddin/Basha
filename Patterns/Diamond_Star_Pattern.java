package Patterns;
import java.util.Scanner;

public class Diamond_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // use space for clean formatting
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < n - i; l++) {
                System.out.print("*");
            }
            System.out.println(); // just print newline
        }
    }
}
