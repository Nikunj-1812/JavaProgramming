package Funtion;

public class DecimalToOctal {
    public static int decimalToOctal(int n){
        int octal = 0;
        int power = 1;
        while (n>0) {
            int lastDigit = n%8;
            octal += lastDigit*power;
            power*=10;
            n/=8;
        }
        return octal;
    }
    public static void main(String[] args) {
        int n = 64;
        System.out.println(decimalToOctal(n));
    }
}
