package logicalPrograms;

import java.util.Scanner;

public class P3PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        checkPrime(n);
    }

    public static void checkPrime(int n) {
        int factors = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors <= 2) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("It's not a Prime Number");
        }
    }
}
