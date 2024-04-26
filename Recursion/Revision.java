package Recursion;
public class Revision {
    public static void print(int n){
       if(n<=0)return;
            print(n-1);
            System.out.println(n);
            print(n-1);
    }

    public static void main(String[] args) {
        print(4);
    }
}

