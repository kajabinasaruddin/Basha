package HackerRank_18;
import java.util.Scanner;
//Sample Input 0
//HelloWorld
//Beautiful
//5
//Sample Output 0
//HelloBeautifulWorld
public class Insert_a_substring_at_a_specific_position_in_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=sc.nextInt();
        String result= s1.substring(0,n)+s2+s1.substring(n);
        System.out.println(result);
    }
}