import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringTokenizer sb=new StringTokenizer(name);
        while(sb.hasMoreTokens()){
            System.out.println(sb.nextToken());
        }
    }
}
