package Operators;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int a = 19;
        System.out.println(a>18 ? "Adult" : "Minor"); 
        int z = 1;
        System.out.print(++z + z++ + --z + z--);
    }
}
