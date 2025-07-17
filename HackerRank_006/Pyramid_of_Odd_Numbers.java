package HackerRank_006;
import java.util.Scanner;
public class Pyramid_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(num+" ");
                num=num+2;
            }
            System.out.println(" ");
        }
    }
}
