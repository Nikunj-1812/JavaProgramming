package Operators;

public class TernaryMaxOfThree {
    public static void main(String[] args) {
        int a = 60;
        int b = 70;
        int c = 50;
        
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c); 
        System.out.println(max);
    }
    
}
