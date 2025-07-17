import java.util.Scanner;
public class count {
    public static void main(String[] args) {

//8 3 15 1 6 10 5 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            System.out.print(array[i] + " ");

            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("");
        System.out.println(even);
        System.out.println(odd);

    }
}
