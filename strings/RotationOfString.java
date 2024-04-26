package strings;

public class RotationOfString {
    public static void main(String[] args) {
        String s="ABCD";
        String b="ACBD";
        String str= s+s;
        System.out.println(str);
        if(s.indexOf(b)==-1){
            System.out.println("flase");
        }else {
            System.out.println("true");
        }
        System.out.println(s.indexOf("BCA"));
    }
}
