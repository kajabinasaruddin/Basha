import java.util.Scanner;
public class Remove_the_element_in_an_array {
    /*Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=sc.nextInt();
        int[] array=new int[n];
        int k=0;
        for(int i=1;i< array.length;i++){
            array[i]=sc.nextInt();
            if(array[i] != val){
                array[k]=array[i];
                k++;
            }
        }
        System.out.print(k);
    }
}
