package Practice_string_problems;
import java.util.Scanner;
public class Reverse_of_string_using_string_builder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());
    }
}
