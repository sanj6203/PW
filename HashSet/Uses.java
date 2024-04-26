package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Uses {
    public static void main(String[] args) {
        Set<Integer> st= new HashSet<>();
        st.add(4);
        st.add(6);
        st.add(8);
        System.out.println(st.add(9));
        System.out.println(st.add(8));
        System.out.println(st.remove(4));
        System.out.println(st.isEmpty());
        System.out.println(st.contains(8));
        Object[] newObj= st.toArray();
        System.out.println(newObj[2]);
        System.out.println(st.size());
        System.out.println(st);
    }
}
