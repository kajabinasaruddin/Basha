package Map_Problems;
import java.util.HashMap;
import java.util.Map;
public class hashMap_with_homogeneous {
    public static void main(String[] args) {
        Map<Integer,String>m1=new HashMap<>();
        m1.put(1,"alice");
        m1.put(2,"bob");
        m1.put(3,"charlie");
        m1.put(4,"null");
        m1.put(null,"null");
        System.out.println(m1);
    }
}
