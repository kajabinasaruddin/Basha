package Collection_all_implementation_classes_working_Procecess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println("using normal for loop:");
        System.out.println(l1);
        Iterator<Integer>i1=l1.iterator();
        System.out.println("using iterator:");
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println("");
        System.out.println("using enhanced for loop:");
        for(Integer i:l1){
            System.out.print(i+" ");
        }
    }
}