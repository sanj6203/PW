package strings;

public class ReverseString {
    public static String reverse(String str){
        StringBuilder newStr= new StringBuilder();
        int j=str.length()-1;
        while (j>=0){
            newStr.append(str.charAt(j));
            j--;
        }
        return newStr.toString();

    }
    public static void main(String[] args) {
        String str="I am sanjeet singh";
        StringBuilder ans= new StringBuilder();
        int i=0;
        for (int j=0;j<=str.length();j++){
            if (j == str.length() || str.charAt(j) == ' ') {
                String newStr= str.substring(i,j);
                String rev= reverse(newStr);
                ans.append(rev);
                if (j != str.length()) {
                    ans.append(" ");
                }
                i = j + 1;
            }

        }
        System.out.println(ans);
    }
}
