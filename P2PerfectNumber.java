package logicalPrograms;

import java.util.Scanner;

public class P2PerfectNumber {
    public static void checkPerfectNumber(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("It's a perfect number.");
        } else {
            System.out.println("It's not a perfect number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int n = sc.nextInt();

        checkPerfectNumber(n);
    }
}
