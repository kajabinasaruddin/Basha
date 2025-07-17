import java.util.Scanner;
public class Remove_Duplicated_Values_in_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int k=1;
        for(int i=1;i<array.length;i++){
            array[i]=sc.nextInt();
            if(array[i] != array[i-1]){
                array[k]=array[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
