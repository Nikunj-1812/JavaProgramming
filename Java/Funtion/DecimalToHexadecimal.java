public class DecimalToHexadecimal {
    public static String decimalToHexadecimal(int n){
        String hexadecimal = "";
        while (n>0) {
            int lastDigit = n%16;
            char hexDigit;
            if (lastDigit < 10) {
                hexDigit = (char) ('0' + lastDigit);
            } else {
                hexDigit = (char) ('A' + lastDigit - 10);
            }
            hexadecimal = hexDigit + hexadecimal;
            n/=16;
        }
        return hexadecimal;
    }
    public static void main(String[] args) {
        int n = 255;
        System.out.println(decimalToHexadecimal(n));
    }
}