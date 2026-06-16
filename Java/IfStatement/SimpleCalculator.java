package IfStatement;

import java.util.*;

public class SimpleCalculator{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch(ch) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    if(b<=0){
                        System.out.println("Invalid input");
                        break;
                    }
                    else{
                    System.out.println(a/b);
                    break;
                    }
                case '%' :
                    if(b<=0){
                        System.out.println("Invalid input");
                        break;
                    }
                    else{
                        System.out.println("a%b");
                    }

        
                default:
                    System.out.println("Invalid Operator");
                    break;  

            }
        }
    }
    
}