package Funtion;

public class SecondLastDigitisEvenOrNot {
    public static boolean isEven(int n,int r){
        int secondLastDigit = (n/10)%10;
        return secondLastDigit%r==0;
    }
    public static void main(String[] args) {
        int n = 12345;
        int r = 4;
        System.out.println(isEven(n, r));
    }
}
