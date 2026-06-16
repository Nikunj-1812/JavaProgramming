package PractiseQuestion;

public class MaxSumSubarrayofsizeK {

    static int maxSumSubarrayOfSizeK(int arr[], int k) {
        int n = arr.length;
        if (n < k) {
            return 0;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int result = maxSumSubarrayOfSizeK(arr, k);
        System.out.println(result);
    }
}

