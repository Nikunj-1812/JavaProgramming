package Loops;

public class SumOfDigitSquares {
    public static void main(String[] args) {
        int n = 12131;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
