package strings;

public class UpdateEven {
    public static void main(String[] args) {
        String s="sanjeet";
        String b="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                b+='a';
            }else b+=s.charAt(i);
        }
        System.out.println(b);
    }
}
