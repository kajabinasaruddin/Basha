package HackerRank_16;

import java.util.Scanner;

public class Number_of_Prime_Digits_in_a_Number {
    public static boolean isPrimeDigit(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (isPrimeDigit(digit)) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
