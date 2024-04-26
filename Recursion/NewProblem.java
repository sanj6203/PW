package Recursion;

public class NewProblem {
    public static void la(int n){
        if(n<=0){
            return;
        }
        la(--n);
        System.out.print(n+" ");
        la(--n);

    }
    public static void main(String[] args) {
        int a=4;
        la(a);
    }
}
