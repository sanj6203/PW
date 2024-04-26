package Recursion;

public class RemoveDuplicate {
    public static String remove(String str,String NewStr,int idx){
        if(idx==str.length()){
            return NewStr;
        }
        if(str.charAt(idx)!='a'){
            NewStr+=str.charAt(idx);
        }
        return remove(str,NewStr,idx+1);
    }
    public static void main(String[] args) {
        String str="abcax";

        String newString= remove(str,"",0);
        System.out.println(newString);
    }

}
