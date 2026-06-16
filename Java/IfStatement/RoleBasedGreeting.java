package IfStatement;

import java.util.Scanner;

public class RoleBasedGreeting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            switch (name) {
                case "Admin" -> System.out.println("Hello, Admin!");
                case "Student" -> System.out.println("Hello, Student!");
                case "Teacher" -> System.out.println("Hello, Teacher!");
                case "Guest" -> System.out.println("Hello, Guest!");
                default -> System.out.println("Invalid role");
            }
        }
    }
}
