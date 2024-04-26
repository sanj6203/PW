package Arrays;
import java.util.*;

public class MergeOverlap {
    public static int[][] overlappedInterval(int[][] arr)
    {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Queue<Integer> q= new LinkedList<>();
        q.add(arr[0][0]);
        int temp=arr[0][1];
        for (int i=1;i<arr.length;i++){
            if(temp<arr[i][0]){
                q.add(temp);
                q.add(arr[i][0]);
                temp=arr[i][1];
            }else {
                if(arr[i][1]>temp){
                    temp=arr[i][1];
                }
            }

        }
        q.add(temp);
        int n= q.size()/2;
        int tempArr[][]= new int[n][2];
        for (int i=0;i<n;i++){
            tempArr[i][0]=q.remove();
            tempArr[i][1]=q.remove();
        }
        return tempArr;
    }
    public static void main(String[] args) {
//        1 3 2 4 6 8 9 10
        int arr[][]={{9,10},{2,4},{6,8},{1,3}};
//        int arr[][]= {{1,5},{2,6},{3,4},{7,12}};
        int[][] newArr=overlappedInterval(arr);
        for (int i=0;i<newArr.length;i++){
            for (int j=0;j<newArr[i].length;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
//        overlappedInterval(arr);
    }
}
