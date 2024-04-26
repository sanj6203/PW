package strings;

import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        String s= Long.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
