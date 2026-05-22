package Loops;

public class NestedLoopsGrid {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
