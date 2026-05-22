package Variables;

public class SwapVariablesExample {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int temp = first;

        first = second;
        second = temp;

        System.out.println(first);
        System.out.println(second);
    }
}