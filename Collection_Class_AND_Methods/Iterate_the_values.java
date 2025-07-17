package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
public class Iterate_the_values {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
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
        System.out.println(l1.size());
        //List using normal for loop(regular for loop,traversal loop).
        System.out.println("normal for loop:");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println("");
        System.out.println("using enhanced for loop:");
        for(Integer i:l1){
            System.out.print(i+" ");
        }
    }
}
