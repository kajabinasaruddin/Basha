import java.util.Scanner;
public class Move_zeros_to_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i< array.length;i++){
            if(array[i]!=0){
                array[count]=array[i];
                count++;
            }
        }
        for(int i=count;i< array.length;i++){
            array[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
