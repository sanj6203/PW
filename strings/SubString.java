package strings;

public class SubString {
    public static void main(String[] args) {
        String a= "abcd";
        System.out.println(a.length());
        for (int i=0;i<a.length();i++){
            for (int j=i+1;j<= a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
}
