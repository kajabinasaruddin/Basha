package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Remove_Common_ELements_in_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        System.out.println("enter a number:");
        int n1=sc.nextInt();
        List<Integer>l2=new ArrayList<>();
        for(int i=0;i<n1;i++){
            l2.add(sc.nextInt());
        }
        System.out.println(l2);
        l1.removeAll(l2);
        System.out.println(l2);
    }
}