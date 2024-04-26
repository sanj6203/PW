package Recursion;

public class Reverse {
    public static String reverse(String str, String newString, int idx) {
        if (idx == str.length()) {
            return newString;
        }

        // Corrected recursive call
        newString = reverse(str, newString, idx + 1) + str.charAt(idx);
        return newString;
    }
    public static void main(String[] args) {
        String str="abcde";
        String reverseString= reverse(str,"",0);
        System.out.println(reverseString);
    }
}
