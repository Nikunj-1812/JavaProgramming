package Loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong Number");

        }
        else{
            System.out.println("Not a armastrong");
            
        }
    }
}
