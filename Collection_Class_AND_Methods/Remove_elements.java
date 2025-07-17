package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Remove_elements {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);
    }
}
