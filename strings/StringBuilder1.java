package strings;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("sanjeet");
        str.setCharAt(0,'a');
        System.out.println(str);
        str.reverse();
        System.out.println(str.charAt(3));
        System.out.println(str);
        str.append("sanjet");
        System.out.println(str);
        str.insert(3,"sanjeet");
        System.out.println(str);
        str.delete(0,1);
        System.out.println(str);

    }
}
