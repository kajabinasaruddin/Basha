package hashSet_Problems_in_Class;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class HashSet_Example {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(null);
        System.out.println(set);
        Set<Integer> set1=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(null);


        System.out.println(set);

    }
}
