package Operators;

import java.util.*;

public class LastDigitExtractor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int sol = num % 10;
            System.out.println("The last digit of the number is: " + sol);
        }
    }
}