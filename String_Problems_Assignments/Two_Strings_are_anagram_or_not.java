package String_Problems_Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Two_Strings_are_anagram_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}