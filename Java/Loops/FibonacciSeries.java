package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i <n; i++) {
                System.out.println(num1);
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
    }
    }

