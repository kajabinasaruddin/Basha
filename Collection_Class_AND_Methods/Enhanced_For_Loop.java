package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Enhanced_For_Loop {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("nasiruddhin");
        l1.add("mastanbhi");
        l1.add("hussenbhi");
        l1.add("khajabi");
        l1.add("mastanbhi");
        l1.add("null");
        for(String name:l1){
            System.out.println(name);
        }
        l1.add("null");
        List<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(5);
        l2.add(11);
        l2.add(17);
        l2.add(21);
        l2.add(null);
        for(Integer i:l2){
            System.out.println(l2);
        }
        l1.add(null);
        System.out.println(l1.contains("basha"));
        System.out.println(l1.size());
        System.out.println(l2.size());
    }
}