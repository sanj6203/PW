package Arrays;

public class QuickSort {
    static void displayArray(int[] arr){
        for (int val: arr){
            System.out.print(val + " ");

        }
    }
    static void swap(int []arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    static int partition(int[]arr,int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1; i<=end; i++){
            if (arr[i]<=pivot) count++;



        }

        int pivotIdex = st+count;
        swap(arr,st,pivotIdex);
        int i = st, j= end;

        while (i<pivotIdex && j> pivotIdex){
            while (arr[i]<= pivot) i++;
            while (arr[j]>= pivot) j--;
            if (i<pivotIdex && j>pivotIdex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdex;


    }

    static void quickSort(int []arr, int st, int end){
        if (st>= end) return;
        int pi = partition(arr,st,end);
        quickSort(arr,0,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int [] arr = {12,15,6,9,0,3,11,23};
        System.out.println("array before sorting : " + " ");
        displayArray(arr);
        System.out.println();

        quickSort(arr,0,arr.length-1);
        System.out.println("array after sorting : " + " ");
        displayArray(arr);

    }
}

