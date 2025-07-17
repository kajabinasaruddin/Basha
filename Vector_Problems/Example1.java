package Vector_Problems;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class Example1 {
    public static void main(String[] args) {
        List<Integer>l1=new Vector<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        System.out.println(l1.get(0));
    }
}