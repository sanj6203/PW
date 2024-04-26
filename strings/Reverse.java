package strings;

public class Reverse {
    public static void main(String[] args) {
        String s="bikash";
        String news="";
        for(int i=s.length()-1;i>=0;i--){
            news+=s.charAt(i);
        }
        System.out.println(news);
    }
}
