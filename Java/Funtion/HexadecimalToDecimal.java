package Funtion;

public class HexadecimalToDecimal {
    public static int hexadecimalToDecimal(String hex){
        int decimal = 0;
        int power = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexDigit = hex.charAt(i);
            int digitValue;
            if (hexDigit >= '0' && hexDigit <= '9') {
                digitValue = hexDigit - '0';
            }
            else if(hexDigit >= 'A' && hexDigit <= 'F') {
                digitValue = hexDigit - 'A' + 10;
            }
            else{
                System.out.println("Invalid input");
                return -1;
            }
            decimal += digitValue*power;
            power *= 16;
        }
        return decimal;
        }

    public static void main(String[] args) {
        String hex = "FF";
        System.out.println(hexadecimalToDecimal(hex));
        }
    }

