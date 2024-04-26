package strings;

public class CountAndSay {
    public static String countAndSay(int n){
        if(n==1) return "1";
        String str= "1";
        StringBuilder ans= new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int count = 1;
            char previous = str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                char current = str.charAt(j);
                if (current == previous) {
                    count++;
                } else {
                    ans.append(count);
                    ans.append(previous);
                    count = 1;
                    previous = current;
                }
            }
            ans.append(count);
            ans.append(previous);
            str = ans.toString();
            ans.setLength(0);
        }
        return str;
    }

    public static void main(String[] args) {
        int n = 5;
        String str = countAndSay(n);
        System.out.println(str);  // Output: 111221
    }
}
