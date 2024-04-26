package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Sanjeet");
        System.out.println(sb);
        sb.insert(1,"ba");
        System.out.println(sb);
        sb.setCharAt(4,'t');
        System.out.println(sb);
        sb.append('b');
        System.out.println(sb);
        System.out.println(sb.length());
        sb.delete(4,6);
        System.out.println(sb );
        System.out.println(sb);

    }
}
