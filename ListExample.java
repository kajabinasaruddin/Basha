import jdk.jfr.SettingControl;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        Set<Integer> set=new HashSet<>(l1);
        System.out.println(set);
    }
}
