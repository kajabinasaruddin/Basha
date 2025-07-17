package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Add_All_method {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        List<Integer> l2=new ArrayList<>();
        l2.add(60);
        l2.add(70);
        l2.add(80);
        l2.add(90);
        l2.add(100);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
