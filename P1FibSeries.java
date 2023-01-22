package logicalPrograms;

import java.util.Scanner;

public class P1FibSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many fibonacci numbers to print: ");
        int n = sc.nextInt();

        getFibonacciSeries(n);
    }

    public static void getFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int next;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
