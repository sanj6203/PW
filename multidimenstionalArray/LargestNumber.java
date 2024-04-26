package multidimenstionalArray;

public class LargestNumber {

    public static int largest(int[][] arr){
        int largest= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
    }
    public static int sum(int[][] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]= {{11,2,3},{4,5,6},{7,8,9}};
//        int larg= largest(arr);
//        System.out.println(larg);
        int sum= sum(arr);
        System.out.println(sum);
    }
}
