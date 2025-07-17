package Methods_Practice_Problems;

import java.util.Scanner;

public class Print_even_numbers_Using_Method {
    public int hello(int n){
        int sum=0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print_even_numbers_Using_Method obj=new Print_even_numbers_Using_Method();
        System.out.println(obj.hello(n));

    }

}
