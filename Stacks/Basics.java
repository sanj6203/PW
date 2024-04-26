package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> temp= new Stack<>();
        while (st.isEmpty()!=true){
            temp.push(st.pop());

        }
        System.out.println(temp);
        Stack<Integer> newStack= new Stack<>();
        while (temp.isEmpty()!=true){
            newStack.push(temp.pop());
        }
        System.out.println(newStack);
    }
}
