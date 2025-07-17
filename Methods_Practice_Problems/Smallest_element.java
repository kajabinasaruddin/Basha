package Methods_Practice_Problems;
import java.util.Scanner;
public class Smallest_element {
    public int smallestElement(int n1,int n2,int n3){
        int smallest=n1;
        if(n2<smallest){
            smallest =n2;
        }
        if(n3<smallest)
            smallest=n3;
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number:");
        int n1=sc.nextInt();
        System.out.println("enter a second number:");
        int n2=sc.nextInt();
        System.out.println("enter a third number:");
        int n3=sc.nextInt();
        Smallest_element obj=new Smallest_element();
        System.out.println(obj.smallestElement(n1,n2,n3));

    }
}
