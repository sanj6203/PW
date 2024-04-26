package Hashmap;

import java.util.HashMap;

public class Basics2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        // put - O(1)
        hm.put("sanjeet",5);
        hm.put("bikash",6);
        hm.put("rohit",8);
        hm.put("sanjeet",hm.get("sanjeet")+1);
        System.out.println(hm); // {bikash=6, sanjeet=6, rohit=8}
        //get -O(1)
        System.out.println(hm.get("bikash"));// 6
        System.out.println(hm.get("ranju")); // null
        // remove -O(1)
        System.out.println(hm.remove("bikash")); // 6
        System.out.println(hm.remove("ranju")); // null
        System.out.println(hm); //{sanjeet=6, rohit=8}
        // containsKey -O(n)
        System.out.println(hm.containsKey("sanjeet")); // true
        System.out.println(hm.containsKey("ranju")); // false
        // size
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm);


    }
}
