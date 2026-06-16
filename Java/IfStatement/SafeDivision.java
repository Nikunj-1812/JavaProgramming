package IfStatement;


import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                double div = num1 / num2;
                System.out.println("The division of the two numbers is: " + div);
            }
        }
    }
}