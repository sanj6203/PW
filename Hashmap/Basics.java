package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        // to put key and value
        mp.put("akash",33);
        mp.put("vikash",55);
        mp.put("ramesh",78);
        mp.put("rajesh",67);
        System.out.println(mp);
        System.out.println(mp.get("akash"));
        mp.put("vikash",45);
        System.out.println(mp);
        //to get particular key value
        System.out.println(mp.get("rohit"));
        //remove
        System.out.println(mp.remove("vikash"));
        System.out.println(mp.remove("land"));
        //contains
        System.out.println(mp.containsKey("akash"));
        // if that key is not present then it will put
        mp.putIfAbsent("vikash",55);
        System.out.println(mp);
        //give the set of key
        System.out.println(mp.keySet());
        //give the set of values
        System.out.println(mp.values());
        // to get all the entries of hashmap
        System.out.println(mp.entrySet());
        // to traverse to all the element of hashmap
        for (String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
    }
}
