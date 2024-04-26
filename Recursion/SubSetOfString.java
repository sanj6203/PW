package Recursion;

public class SubSetOfString {
    public static void subset(String str,int i,int n,String ans){
        if(i==n){
            System.out.println(ans);
            return;
        }
        subset(str,i+1,n,ans);
        subset(str,i+1,n,ans+str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abcd";
        subset(str,0,str.length(),"");

    }
}
