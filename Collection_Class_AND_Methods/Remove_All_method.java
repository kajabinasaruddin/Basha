package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Remove_All_method {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("alice");
        l1.add("bob");
        l1.add("charlie");
        List<String> l2=new ArrayList<>();
        l2.add("danger");
        l2.add("charlie");
        l2.add("bob");
        l1.removeAll(l2);
        System.out.println(l1);
    }
}
