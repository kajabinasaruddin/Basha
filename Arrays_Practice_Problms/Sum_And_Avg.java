package Arrays_Practice_Problms;
import java.util.Scanner;
public class Sum_And_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
            sum+=array[i];
        }
        System.out.println("");
        System.out.println("sum:" +sum);
        int avg=sum/n;
        System.out.println("avg:" +avg);
        // int avg=sum/array.length ;
        //System.out.println("avg:" +avg);
    }
}
