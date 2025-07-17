package Arrays_Practice_Problms;
import java.util.Arrays;
public class Merge_Two_arrays {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[] arrays={5,6,7,8};
        int a1=array.length;
        int a2= arrays.length;
        int c1=a1+a2;
        int [] c=new int[c1];
        for(int i=0;i<a1;i++){
            c[i]=array[i];
        }
        for(int i=0;i<a2;i++){
            c[a1+i]=arrays[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
