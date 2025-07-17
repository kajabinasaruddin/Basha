package Practice_STrings_Problems;
import java.util.*;

public class Remove_duplicated_words_using_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>li=new ArrayList<>();
        li.add(sc.nextLine());
        System.out.println(li);
        Set<String> s1=new HashSet<>(li);
        System.out.println(s1);
    }
}
