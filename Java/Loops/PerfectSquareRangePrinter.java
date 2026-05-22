package Loops;

import java.util.Scanner;

public class PerfectSquareRangePrinter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int i = 1;i<= m;i++){
                if(i*i >= n && i*i <= m)
                    System.out.println(i*i);  
                if(i*i>m) break;   
            }
        }
            
    }
}
