package Practice_STrings_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Remove_Duplicates_from_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String result=" ";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
