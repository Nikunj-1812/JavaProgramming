packacge PractiseQuestion;

public class MaxConsecutiveBits {
    public static void main(String[] args) {
        int n = 14; // Example input
        int maxConsecutiveOnes = findMaxConsecutiveOnes(n);
        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int n) {
        String binaryString = Integer.toBinaryString(n);
        int maxCount = 0;
        int currentCount = 0;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}