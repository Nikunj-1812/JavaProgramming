package Datatypes;

public class ExplicitTypeCastingExample {
    public static void main(String[] args) {
        double price = 99.75;
        int roundedPrice = (int) price;
        char letter = (char) 65;

        System.out.println(roundedPrice);
        System.out.println(letter);
    }
}