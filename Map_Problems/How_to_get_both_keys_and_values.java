package Map_Problems;
import java.util.HashMap;
import java.util.Map;
public class How_to_get_both_keys_and_values {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"alice");
        m1.put(2,"bob");
        m1.put(3,"charlie");
        m1.put(4,"null");
        m1.put(null,"null");
        for(Map.Entry<Integer,String>entry:m1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}