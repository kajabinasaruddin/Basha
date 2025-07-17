package HackerRank_006;

public class Binary_Pattern_Triangle {
}

/* import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("Prime factorization of " + number + " is: ");

        // Factor out the number of twos
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Factor out remaining odd numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If number is still a prime number greater than 2
        if (number > 2) {
            System.out.print(number);
        }
    }
} */
