package Arrays;
import java.util.Scanner;
public class EnterPress {
    public static void main(String[] args) {
        int i = 0;
        String st="";
        Scanner sc = new Scanner(System.in);
        while (st.equals("")) {
            System.out.println(i);
            st = sc.nextLine();
            i++;
            if (i == 10) i = 0;
        }
    }
}
