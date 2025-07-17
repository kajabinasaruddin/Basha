package HackerRank_18;
import java.util.Scanner;
//Sample Input        HelloWorld
//Sample Output        HllWrld
//Sample Input     ProgrammingIsFun
//Sample Output 1   PrgrmmngsFn
public class Delete_all_vowels_from_a_string_using_StringBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

}
