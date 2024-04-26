package Arrays;
import java.util.Arrays;
import java.util.Comparator;

    public class comparator {
        public static void main(String[] args) {
            // Sample two-dimensional array
            int[][] arr = {{3, 2, 5}, {1, 7, 4}, {6, 8, 9}};

            // Sort the array column-wise based on the first column
            Arrays.sort(arr, Comparator.comparingInt(a -> a[2]));

            // Print the sorted array
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }


