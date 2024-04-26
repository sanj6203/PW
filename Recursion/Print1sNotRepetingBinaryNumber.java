package Recursion;

public class Print1sNotRepetingBinaryNumber {
    public static void printString(String str,int n){
        int l= str.length();
        if(l==n){
            System.out.println(str);
            return;
        }
        if (l == 0 || str.charAt(l - 1) == '0') {
            printString(str+0,n);
            printString(str+1,n);
        }else {
            printString(str+0,n);
        }
    }
    public static void main(String[] args) {
        printString("",13);
    }
}
