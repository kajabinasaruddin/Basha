package Vector_Problems;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class Example2 {
    public static void main(String[] args) {
        List<Integer> l1=new Vector<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        Iterator<Integer> l2=l1.iterator();
        while(l2.hasNext()){
            System.out.println(l2.next());
        }
    }
}
