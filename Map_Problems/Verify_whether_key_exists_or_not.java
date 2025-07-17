package Map_Problems;
import java.util.HashMap;
import java.util.Map;
public class Verify_whether_key_exists_or_not {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"alice");
        m1.put(2,"bob");
        m1.put(3,"charlie");
        m1.put(4,"null");
        m1.put(null,"null");
        Integer val=1;
        boolean b=m1.containsKey(val);
        if(b){
            System.out.println("existed");
        }
        else{
            System.out.println("Not existed");
        }
    }
}
