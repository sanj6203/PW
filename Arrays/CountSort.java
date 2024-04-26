package Arrays;
import java.util.*;
public class CountSort {
    public static void countingSort(int[] arr) {
        // Find the maximum element to determine the range
        int max = findMax(arr);

        // Create an array to store the count of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int num : arr) {
            count[num]++;
        }

        // Modify the count array to store the cumulative count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create a temporary array to store the sorted result
        int[] result = new int[arr.length];

        // Build the sorted array using the count array
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted result back to the original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

