package Dp;

import java.util.HashMap;

public class FiboSeries {
    public static int fibo(int n){
        return fibo(n,new HashMap<>());
    }
    public static int fibo(int n, HashMap<Integer,Integer> memo){
        if (n == 0 || n == 1) {
            return n;
        }
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        int result= fibo(n-1,memo)+fibo(n-2,memo);
        memo.put(n,result);
        return  result;
    }
    public static boolean ret(int n){
        if(n==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n=1;
//        int result= fibo(n);
//        System.out.println(result);
        System.out.println(ret(n));
    }
}
