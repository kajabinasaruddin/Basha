package HackerRank_010;
import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        boolean swapped=false;
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        System.out.println("");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
