package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Convert_ArrayList_to_Array {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("nasiruddhin");
        l1.add("mastanbhi");
        l1.add("hussenbhi");
        l1.add("khajabi");
        Object[] obj=l1.toArray();
        for(Object ob:obj){
            System.out.println(ob);
        }
        //ArrayList to Array
    }
}