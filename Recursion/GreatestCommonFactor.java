package Recursion;

public class GreatestCommonFactor {
    public static int greatestCommonFactor(int n, int m) {
        if (m == 0) {
            return n;
        }
        n= Math.abs(n-m);
        return greatestCommonFactor(m, n);
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 15;
        System.out.println("Greatest Common Factor: " + greatestCommonFactor(n, m));
        System.out.println(n%m);
    }
}
