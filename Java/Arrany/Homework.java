package Arrany;
public class Homework {

    public static int[] sumArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    public static int[] subtractArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static int maxDuplicateDistance(int[] arr) {
        int maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance;
    }

    public static int shortBetweenEven(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                size++;
            }
        }
        if (size < 2) return -1;
        int[] temp = new int[size];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[j] = i;
                j++;
            }
        }

        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < size - 1; i++) {
            int currentDistance = temp[i + 1] - temp[i];
            if (currentDistance < distance) {
                distance = currentDistance;
            }
        }
        return distance;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};

        int[] sumResult = sumArray(arr1, arr2);
        printArray(sumResult);

        int[] subtractResult = subtractArray(arr1, arr2);
        printArray(subtractResult);

        int[] duplicateArr = {1, 2, 3, 1, 4, 2, 1};
        System.out.println(maxDuplicateDistance(duplicateArr));

        int[] evenArr = {1, 2, 3, 3, 4, 5, 6, 4, 4};
        System.out.println(shortBetweenEven(evenArr));
    }
}
