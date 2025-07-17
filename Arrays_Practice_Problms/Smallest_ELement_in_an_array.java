package Arrays_Practice_Problms;
import java.util.Scanner;
public class Smallest_ELement_in_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int min=array[0];
        for(int i=1;i<n;i++){
            if(array[i]<min){
                array[i]=min;
            }
        }
        System.out.println(min);
    }
}
