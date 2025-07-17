package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiable_list {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("alice");
        l1.add("bob");
        l1.add("charlie");
        System.out.println(l1);
        List<String> l2= Collections.unmodifiableList(l1);
        l2.add("danger");
        System.out.println(l2);
    }
}
