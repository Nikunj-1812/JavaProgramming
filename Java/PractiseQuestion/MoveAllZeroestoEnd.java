package PractiseQuestion;

public class MoveAllZeroestoEnd {
    int count = 0;
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12}; 
        MoveAllZeroestoEnd solution = new MoveAllZeroestoEnd();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


