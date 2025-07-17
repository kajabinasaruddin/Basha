import java.util.Scanner;
public class Array_rotation_right {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int last=array[n-1];
        for(int i=n-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=last;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
