package logicalPrograms;

import java.util.Scanner;

public class P4ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int n = sc.nextInt();

        getReverse(n);
    }

    public static void getReverse(int n) {
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}
