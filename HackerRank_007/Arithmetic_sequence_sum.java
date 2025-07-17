package HackerRank_007;
import java.util.Scanner;
public class Arithmetic_sequence_sum {
    public static void main(String[] args) {
         //Sum = 𝑛/2 × (2𝑎 + (𝑛 − 1) × 𝑑)
        //An integer 𝑎, the first term of the sequence. An integer 𝑑, the common difference. An integer 𝑛, the number of terms.
        /*Sample Input  2 3 5
          Sample Output 40 */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        sum=(n * (2 * a + (n - 1) * d)) / 2;
        System.out.println(sum);
    }
}
