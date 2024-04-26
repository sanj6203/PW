package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentlyOccuredElement {
    public static void main(String[] args) {
        int[] arr={4,5,7,4,5,4};
        Map<Integer,Integer> freq= new HashMap<>();
        for (int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else {
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int mxFreq=0 , ansKey= -1;
        for (var e: freq.entrySet()){
            if(e.getValue()> mxFreq){
                mxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey,mxFreq);
    }
}
