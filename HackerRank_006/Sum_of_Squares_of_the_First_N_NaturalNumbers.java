package HackerRank_006;
import java.util.Scanner;
public class Sum_of_Squares_of_the_First_N_NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*i);
        }
        System.out.println(sum);
    }
}
