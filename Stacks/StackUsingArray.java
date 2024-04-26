package Stacks;

public class StackUsingArray {
    public static class Stack{
        private int[] arr;
        private int idx=-1;
        private int n;

        Stack(int size){
            arr=new int[size];
            n=size;
        }
        void push(int val){
            if(idx>=n){
                System.out.println("Stack overflow");
                return;
            }
            idx++;
            arr[idx]=val;

        }
        int size(){
            return idx+1;
        }
        void display(){
            for (int i=0;i<=idx;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        int pop(){
            int val= arr[idx];
            idx--;
            return val;
        }
        int peek(){
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(45);
        st.push(34);
        st.push(78);
        st.push(90);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        st.display();
    }
}
