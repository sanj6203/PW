package strings;

public class Equals {
    public static void main(String[] args) {
        String s="sanjeetsingh";
        String b="sanjeetsingh";
        String c= new String(s);
        String d= "sanjeet";
        d= d+"singh";
//        System.out.println(s==b);
//        System.out.println(s==c);
//        System.out.println(s==d);
//        System.out.println(b==c);
//        System.out.println(s.equals(b));
//        System.out.println(s.equals(c));
//        System.out.println(s.equals(d));
//        System.out.println(b.equals(c));
        System.out.println(s.compareTo(b));
        System.out.println(s.compareTo(c));
        System.out.println(s.compareTo(d));
        System.out.println(b.compareTo(c));

    }
}
