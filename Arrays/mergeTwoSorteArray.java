package Arrays;

public class mergeTwoSorteArray {



    public static void main(String[] args) {
        int [] arr1={4,8};
        int[] arr2={5,9,17,21,60};
        int[] newArray=  mergeArray(arr1,arr2);
        for (int ele:
             newArray) {
            System.out.print(ele+" ");
        }
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        int n= arr1.length+arr2.length;
        int[] newArray=new int[n];
        while (k<n){
            if(i<arr1.length && j<arr2.length){
                if(arr1[i]<arr2[j]){
                    newArray[k]=arr1[i];
                    i++;
                }else{
                    newArray[k]=arr2[j];
                    j++;
                }
                k++;
            } else if (i< arr1.length && j>=arr2.length) {
                newArray[i]=arr1[i];
                i++;
                j++;
            }else {
                newArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        return newArray;

    }


}
