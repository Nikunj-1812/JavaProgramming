package Loops;

public class CombinationsCalculator {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 10;
        int r = 2;
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(nCr);
    }
}
