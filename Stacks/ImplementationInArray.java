package Stacks;

public class ImplementationInArray {
    public static class Stack{
        private int[] arr;
        private int idx=0;
        private int n;
        Stack(int size){
            arr=new int[size];
            n=size;
        }
        void push(int val){
            if(idx-1>=n){ System.out.println("Stack is Full!"); return;}
            if(n>=1 && idx<n){
                arr[idx]=val;
                if(idx<n-1) {
                    idx++;
                }
            }
        }
        void display(){
            for (int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        int peek(){
            return arr[idx];
        }
        int size(){
            return idx;
        }
    }
    public static void main(String args[]){
        Stack st= new Stack(5);
        st.push(45);
        st.push(56);
        st.push(45);
        st.push(56);
        st.push(5);
        st.push(456);
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
