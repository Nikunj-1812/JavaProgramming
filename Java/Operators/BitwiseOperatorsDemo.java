package Operators;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("x << 1: " + (x << 1));
        System.out.println("x >> 1: " + (x >> 1));
    }
}
