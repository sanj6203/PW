package strings;

public class Interning {
        public static void main(String[] args) {
            String s1 = new String("Hello");
            String s2 = "Hello";

            // Using intern() to intern the string
            String s3 = s1.intern();

            System.out.println(s1 == s2);  // false, as they refer to different objects
            System.out.println(s2 == s3);  // true, as s3 now refers to the interned string
        }
    }


