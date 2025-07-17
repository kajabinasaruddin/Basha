package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String>l1=new ArrayList<>();
        l1.add("nasaruddin");
        l1.add("mastanbhi");
        l1.add("hussenbhi");
        l1.add("khajabi");
        l1.add("null");
        l1.add("null");
        System.out.println(l1);
        l1.remove(2);
        System.out.println("after romeving names:");
        System.out.println(l1);
        l1.set(3,"mastanbhi");
        System.out.println("after sets a string:");
        System.out.println(l1);
    }
}