package Loops;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int gcd = 1;
        for (int i=1; i<=a; i++) {
            for(int j=1; j<=b; j++) {
                if (a % i == 0 && b % j == 0 && i == j) {
                    gcd = i;
                }
            }
        }
        
        System.out.println(gcd);
    }
}
