package HackerRank_015;
import java.util.Scanner;
public class Rotate_an_array_kth_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        for (int i = n - k; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < n - k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
