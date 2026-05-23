package Function;


public class VowelOrNot {
   public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
} 
public static void main(String[] args) {
    char ch = 'a';
    if (isVowel(ch)) {
        System.out.println(" is a vowel.");
    } else {
        System.out.println(" is not a vowel.");
    }
}
}
