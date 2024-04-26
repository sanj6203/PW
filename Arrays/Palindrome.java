package Arrays;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        boolean flag=false;
        int num=0;
        while(x>0){
            int rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        if(num==x){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        boolean output= isPalindrome(121);
        System.out.println(output);
//        int n= 1/10;
//        System.out.println(n);
    }
}
