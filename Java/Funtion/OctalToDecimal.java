package Function;

public class OctalToDecimal {
    public static int octalToDecimal(int n){
        int decimal = 0;
        int power = 1;
        while (n>0) {
            int lastDigit = n%10;
            if (lastDigit > 7) {
    System.out.println("Invalid octal number");
    return -1;
}
            decimal += lastDigit*power;
            power *= 8;
            n /= 10;
        }
        return decimal;
    }
    public static void main(String[] args){
        int n = 21;
        System.out.println(octalToDecimal(n));
    }
}