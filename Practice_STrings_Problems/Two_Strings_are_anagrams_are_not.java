package Practice_STrings_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Two_Strings_are_anagrams_are_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        String n1=name1.toLowerCase();
        String n2=name2.toLowerCase();
        char[] ch1=n1.toCharArray();
        char[] ch2=n2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("angram");
        }
        else{
            System.out.println("not anagrams");
        }
    }
}
