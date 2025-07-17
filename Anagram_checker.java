import java.util.Arrays;
import java.util.Scanner;
public class Anagram_checker {
    public static void main(String[] args) {
       // listen  silent(check anagrams)
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        char[] ch1=name1.toCharArray();
        char[] ch2=name2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("true");
        }
        else{
            System.out.println("no");
        }
    }
}
