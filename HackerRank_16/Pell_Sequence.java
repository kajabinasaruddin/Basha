package HackerRank_16;
import java.util.Scanner;
//Sample Input 0
//5
//Sample Output 0
//29
//Explanation 0
//P(0) = 0 P(1) = 1 P(2) = 2 * P(1) + P(0) = 2 * 1 + 0 = 2 P(3) = 2 * P(2) + P(1) = 2 * 2 + 1 = 5
// P(4) = 2 * P(3) + P(2) = 2 * 5 + 2 = 12 P(5) = 2 * P(4) + P(3) = 2 * 12 + 5 = 29
public class Pell_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
            return ;
        }
        else if(n==1){
            System.out.println(1);
            return;
        }
        int[] l=new int[n+1];
        l[0]=0;
        l[1]=1;
        for(int i=2;i<=n;i++){
            l[i]=2*l[i-1]+l[i-2];
        }
        System.out.println(l[n]);
    }
}
