package Stacks;

import java.util.Stack;

public class PrintR {
    public static void printRec(Stack<Integer> st){
        if(st.isEmpty()==true)return;
        int top= st.pop();
        printRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void printReverseRec(Stack<Integer> st){
        if(st.isEmpty()==true)return;
        int top= st.pop();
        System.out.print(top+" ");
        printReverseRec(st);
        st.push(top);
    }
    public static void insertAtBottom(Stack<Integer> st,int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top= st.pop();
        insertAtBottom(st,val);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1)return;
        int top= st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        printRec(st);
//        System.out.println();
//        printReverseRec(st);
        insertAtBottom(st,11);
        printRec(st);
        reverse(st);
        System.out.println(st);
    }
}
