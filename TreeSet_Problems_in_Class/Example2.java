package TreeSet_Problems_in_Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class Example2 {
    public static void main(String[] args) {
        TreeSet<Integer> l1=new TreeSet<>(Arrays.asList(3,9,1,4,2,0,10));
        System.out.println(l1);
        List<Integer>l2=new ArrayList<>(l1);
        System.out.println(l2);
    }
}
