package Operators;

public class ShortCircuitEvaluation {
    
    public static void main(String[] args) {
        int x = 10;

        if (x > 5 || ++x > 100) {
            System.out.println("True");
        }
    }



}
 
