package Arrays;

public class TwoPointerApproach {
    public static void sortArray(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            if(low==0)low++;
            else if (high==1)high--;
            else {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }


        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,1,1,0,0,1,0,1,0,0};
        sortArray(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
