package Arrays;

public class SecondLargest {
    public static int secondLargest(int arr[]){
        int largest=arr[0];
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                int temp=largest;
                largest=arr[i];
                if(temp>secondLargest){
                    secondLargest=temp;
                }
            }else{
                if(secondLargest<arr[i]){
                    secondLargest=arr[i];
                }
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={5,7,11,12,15,6,13};
        int second= secondLargest(arr);
        System.out.println(second);
    }
}
