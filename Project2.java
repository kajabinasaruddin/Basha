import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Project2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Set<String>set=new LinkedHashSet<>();
        for(char ch:name.toCharArray()){
            set.add(String.valueOf(ch));
        }
        System.out.println(set);
        String[] array=new String[set.size()];
       for(String names:array){
           System.out.println(names);
       }

    }
}