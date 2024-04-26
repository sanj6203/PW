package Arrays;

public class functionim {
    public static int LinearSearch(int key, int[] arr, int idx) {
        if (idx < arr.length) {
            if (arr[idx] == key) {
                return idx;  // Key found at the current index
            } else {
                // Recursive call to search in the rest of the array
                return LinearSearch(key, arr, idx + 1);
            }
        }
        return -1;  // Key not found in the array
    }

    public static void main(String[] args) {
        int[] arr={2,4,5,7,1,12,45,65,34};
        System.out.println(LinearSearch(12,arr,0));
    }
}
