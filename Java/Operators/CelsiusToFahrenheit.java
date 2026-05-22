package Operators;

import java.util.Scanner;

public class CelsiusToFahrenheit {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int c = sc.nextInt();
        double f = (c * 1.8) + 32;
        System.out.print(f);
    }
}
}