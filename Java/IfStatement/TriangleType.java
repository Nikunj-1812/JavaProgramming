package IfStatement;

public class TriangleType {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 8;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
