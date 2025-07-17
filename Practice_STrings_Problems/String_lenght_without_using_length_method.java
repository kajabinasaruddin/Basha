package Practice_STrings_Problems;
import java.util.Scanner;
public class String_lenght_without_using_length_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int count=0;
        for(int i=0;i<name.length();i++){
            count++;
        }
        System.out.println(count);
    }
}