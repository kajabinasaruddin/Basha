import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
        for(int i=0;i< array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
