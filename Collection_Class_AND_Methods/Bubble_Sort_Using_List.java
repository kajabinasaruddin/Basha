package Collection_Class_AND_Methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bubble_Sort_Using_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        for(int i=0;i<l1.size()-1;i++){
            for(int j=0;j<l1.size()-1-i;j++){
                if(l1.get(j)>l1.get(j+1)){
                   int temp=l1.get(j);
                   l1.set(j,l1.get(j+1));
                   l1.set(j+1,temp);
                }
            }
        }
        System.out.println(l1);
    }
}