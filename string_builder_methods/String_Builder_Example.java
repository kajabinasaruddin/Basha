package string_builder_methods;
import java.util.Scanner;
public class String_Builder_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuilder s=new StringBuilder(name);
        System.out.println(name.concat(" " +"bob"));
    }
}