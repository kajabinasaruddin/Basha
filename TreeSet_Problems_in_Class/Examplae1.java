package TreeSet_Problems_in_Class;
import java.util.*;
public class Examplae1 {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>(Arrays.asList(23,10,4,5,1,2));
        System.out.println(l1); // 23,10,4,5,1,2  //preserved order
        Set<Integer> l2=new TreeSet<>(l1);
        System.out.println(l2);
    }
}
