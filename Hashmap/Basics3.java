package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Basics3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("sanjeet",5);
        hm.put("bikash",6);
        hm.put("rohit",8);
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        Set<String> keys= hm.keySet();
        for (String k: keys) {
            System.out.println("key: "+ k +", value: "+ hm.get(k));
        }
        System.out.println(hm.entrySet());

    }
}
