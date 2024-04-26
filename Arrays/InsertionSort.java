package Arrays;

public class InsertionSort {
    public static void insertion(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int arr[]={2,3,1,55,6,77,8,9};
        insertion(arr,arr.length);
        for (int el:
             arr) {
            System.out.println(el);

        }
    }


}
