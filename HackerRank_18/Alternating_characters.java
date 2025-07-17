package HackerRank_18;
import java.util.Scanner;
//Sample Input
//5
//AAAA
//BBBBB
//ABABABAB
//BABABA
//AAABBB
//Sample Output
//3
//4
//0
//0
//4
public class Alternating_characters {
    public static int characters(String s) {
        int deletion = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletion++;
            }
        }
        return deletion;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(characters(s));
        }
    }
}