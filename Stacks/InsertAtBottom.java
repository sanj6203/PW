package Stacks;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        Stack<Integer> temp= new Stack<>();
        while (st.size()>0){
            temp.push(st.pop());
        }
        st.push(1);

        while (temp.isEmpty()!=true){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
