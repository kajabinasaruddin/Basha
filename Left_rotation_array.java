import java.util.Scanner;
public class Left_rotation_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int first=array[0];
        for(int i=0;i<n-1;i++){
            array[i]=array[i+1];
        }
        array[n-1]=first;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
