package HackerRank_007;
import java.util.Scanner;
public class Reverse_diagonal_number_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=n;i>0;i--){
            for (int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
