package Dp;

public class SumPossible {
    public static boolean sumPossible(int sum, int[] arr){
        if(sum<0){
            return false;
        }
        if(sum==0) return true;
        for (int i=0;i<arr.length;i++){
            sumPossible(sum-arr[i],arr);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int sum=5;
        System.out.println(sumPossible(sum,arr));
    }
}
