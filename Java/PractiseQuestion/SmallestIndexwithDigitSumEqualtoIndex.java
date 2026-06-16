package PractiseQuestion;

public class SmallestIndexwithDigitSumEqualtoIndex {

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int digitSum = 0;

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            if (digitSum == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 25, 7, 10};

        int result = smallestIndex(nums);

        System.out.println(result);
    }
}