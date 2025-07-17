package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Remove_Duplicated_Values {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        l1.add("nasiruddhin");
        l1.add("mastanbhi");
        l1.add("hussenbhi");
        l1.add("khajabi");
        l1.add("mastanbhi");
        System.out.println(l1);
        for(String name:l1){
             if(!l2.contains(name)){
                 l2.add(name);
            }

        }
        System.out.println(l2);

    }
}
