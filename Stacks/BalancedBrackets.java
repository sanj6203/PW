
package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBracket(String str){
        Stack<Character> st= new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='('){
                st.push('(');
            }else {
                if(st.size()==0)return false;
                st.pop();
            }
        }
        if(st.size()!=0){
            return false;
        }else return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(balancedBracket(str));
    }
}
