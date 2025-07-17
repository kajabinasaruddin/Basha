package HackerRank_19;
import java.util.Scanner;
//remainder = a - (a / b) * b
//Sample Input 0
//17
//5
//Sample Output 0
//2
public class Remainder_without_using_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem=a/b;
        int rems=a-(rem*b);
        System.out.println(rems);
    }
}