package IfStatement;


public class StudentGradeReport {
    public static void main(String[] args) {
        int marks = 85;

        switch (marks / 10) {
            case 10, 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            default -> System.out.println("Grade: F");
        }

    }
}