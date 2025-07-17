package Linked_list_Problems;
import java.util.Collections;
import java.util.LinkedList;
public class Add_Elements {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(90);
        l1.add(80);
        l1.add(50);
        l1.add(60);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(l1.reversed());
    }
}