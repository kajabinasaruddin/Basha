package Practice_string_problems;
import java.util.Scanner;
public class Reverse_Of_a_string_first_way {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
    }
}
