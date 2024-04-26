package Arrays;

import java.util.Stack;

public class NextGreaterElement {
//    public static int[] nextGreaterElement(int[] arr){
//        int n= arr.length;
//        int newArr[]= new int[n];
//        newArr[n-1]=-1;
//        int largest= arr[n-1];
//        int current= arr[n-1];
//        for (int i=n-2;i>=0;i--){
//            if(arr[i]<current){
//                newArr[i]=current;
//            }
//            else {
//                if(arr[i]<largest){
//                    newArr[i]=largest;
//                }else {
//                    newArr[i]=-1;
//                }
//            }
//            current=arr[i];
//            if(current>largest)largest=current;
//        }
//        return newArr;
//    }
public static int[] nextGreaterElement(int[] arr){
    int n= arr.length;
    int newArr[]= new int[n];
    newArr[n-1]=-1;
    Stack<Integer> st= new Stack<>();
    st.push(arr[n-1]);
    for (int i=n-2;i>=0;i--){
        if(arr[i]<st.peek()){
            newArr[i]=st.peek();
            st.push(arr[i]);
        }
        else if(arr[i]>st.peek()){
            while (!st.isEmpty()){
                if(st.peek()>arr[i]){
                    newArr[i]=st.peek();
                    break;
                }else {
                    st.pop();
                }
            }
            if(st.isEmpty()) newArr[i]=-1;
            st.push(arr[i]);
        }
    }
    return newArr;
}

    public static void main(String[] args) {
        int arr[]= {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        int[] newArr= nextGreaterElement(arr);
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
