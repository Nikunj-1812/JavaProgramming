package IfStatement;


public class AgeCategoryExample {
    public static void main(String[] args) {
        int age = 21;

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}