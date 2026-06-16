package Loops;

public class FactorialCalculation {
    public static void main(String[] args) {
        // using for loop
        int n = 5;
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        //using while loop
        n = 5;
        fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}