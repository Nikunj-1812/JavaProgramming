package Loops;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers: " + sum);

        int sum2 = 20 * (20 + 1) / 2;
        System.out.println("Sum of natural numbers using formula: " + sum2);

        //time complexity O(n) for the loop and O(1) for the formula.
         
    }
}
