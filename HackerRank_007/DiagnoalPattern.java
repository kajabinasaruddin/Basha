package HackerRank_007;
import java.util.Scanner;
public class DiagnoalPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print(num+"  ");
                    num++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
