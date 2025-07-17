import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FizzBuzz_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l1 = new ArrayList<>();
        String res=" ";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res+=l1.add("\"FizzBuzz\""+" " );
            }
            else if (i % 3 == 0) {
               res+= l1.add("\"Fizz\""+" ");
            }
            else if (i % 5 == 0) {
                res+=l1.add("\"Buzz\""+" ");
            }
            else {
                res+=l1.add(String.valueOf("\""+i+"\""));
            }
        }
        System.out.println(l1);
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i)+" ");
//        }
    }
}