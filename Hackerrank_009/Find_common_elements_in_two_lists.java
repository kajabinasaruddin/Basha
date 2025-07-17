package Hackerrank_009;

import java.util.*;

public class Find_common_elements_in_two_lists {
    /*
    5
    1 2 3 4 5
    5
    4 5 6 7 8
    Sample Output 0
    4
    5
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Integer[] g=(Integer[]) l1.toArray();

       // System.out.println(l1);
        int n1=sc.nextInt();
        List<Integer>l2=new ArrayList<>();
        for(int i=0;i<n1;i++){
            l2.add(sc.nextInt());
        }
      //  System.out.println(l2);
        Set<Integer> set=new HashSet<>(l1);
        Set<Integer> set1=new HashSet<>(l2);
        set.retainAll(set1);
      //  System.out.println(set);
        for(int num:set){
            System.out.println(num);
        }
    }
}