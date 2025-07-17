package Collection_all_implementation_classes_working_Procecess;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;
public class HashMap_Example {
    public static void main(String[] args) {
        Map<Integer,String>m1=new HashMap<>();
        m1.put(1,"alice");
//        System.out.println(m1);
        m1.put(1,"bob");
        System.out.println(m1);
        System.out.println(m1.containsKey(1));
        m1.clear();
        System.out.println(m1);
    }
}
