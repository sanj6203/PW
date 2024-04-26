package Recursion;

public class StairPath {
    static int count=0;
    public static void stairPath(int n){
        helper(n,0);
    }
    private static void helper(int n, int step){
        if(step>n)return;
        if(step==n){
            count++;
        }
        helper(n,step+1);
        helper(n,step+2);
    }
    public static void main(String[] args) {
        int n=8;
        stairPath(n);
        System.out.println(count);
    }
}
