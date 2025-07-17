package HackerRank_006;
import java.util.Scanner;
public class reverse_diagonal_pattern {
    public static void main(String[] args) {
        /*
        Sample Input 3
        Sample Output 0

  *
 *
*
 */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j+i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");}

    }
}
