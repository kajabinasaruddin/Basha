import java.util.Scanner;
public class Even_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int count=0;
        int sum=0;
        for(int i=0;i< array.length;i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("");
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
