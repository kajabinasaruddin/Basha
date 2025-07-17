package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Unique_elements_in_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer > l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        List<Integer> l2=new ArrayList<>();
        for(Integer l:l1){
            if(!l2.contains(l)){
                l2.add(l);
            }
        }
        System.out.println(l2);
    }
}
