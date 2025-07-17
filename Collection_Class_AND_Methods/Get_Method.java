package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Get_Method {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        //get--->searching element,retrieve the data
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        l1.add(90);
        l1.add(100);
        System.out.println(l1);
        System.out.println(l1.get(3));
    }
}
