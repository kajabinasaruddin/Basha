package Practice_STrings_Problems;
import java.util.Scanner;
public class Reverse_Of_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
            StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());
    }
}
