package Loops;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int limit = 50;
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
