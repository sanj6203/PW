package Arrays;
import java.util.*;
public class ImmediateSmallerElement {
        static void immediateSmaller(int arr[], int n) {
            Stack<Integer> st= new Stack<>();
            st.push(arr[0]);
            for(int i=1;i<n;i++){
                if(st.peek()>arr[i]){
                    System.out.print(arr[i]+" ");
                }else{
                    System.out.print(-1 +" ");
                }
                st.pop();
                st.push(arr[i]);
            }
            System.out.print(-1 +" ");
        }

    public static void main(String[] args) {
        int Arr[] = {4, 2, 1, 5, 3};
        int N = 5;
        immediateSmaller(Arr,N);
    }

}
