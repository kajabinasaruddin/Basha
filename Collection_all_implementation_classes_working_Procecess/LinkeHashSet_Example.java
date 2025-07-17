package Collection_all_implementation_classes_working_Procecess;
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class LinkeHashSet_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println("using normal for loop:");
        System.out.println(s1);
        System.out.println("using iterator:");
        Iterator<Integer> i1=s1.iterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println("");
        System.out.println("using enhanced for loop:");
        for(Integer i:s1){
            System.out.print(i+" ");
        }
    }
}
