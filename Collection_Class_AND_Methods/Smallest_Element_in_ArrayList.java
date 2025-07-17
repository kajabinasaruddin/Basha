package Collection_Class_AND_Methods; 
import java.util.ArrayList;
import java.util.List;
public class Smallest_Element_in_ArrayList {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(34);
        l1.add(12);
        l1.add(56);
        l1.add(7);
        l1.add(89);
        l1.add(23);
        l1.add(3);
        l1.add(67);
        l1.add(45);
        l1.add(10);
        int min=l1.get(0);
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)<min){
                min=l1.get(i);
            }
        }
        System.out.println(min);
    }
}