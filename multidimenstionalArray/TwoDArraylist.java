package multidimenstionalArray;

import java.util.ArrayList;
import java.util.List;

public class TwoDArraylist {
    public static void oneD(){
        List <Integer> arr= new ArrayList<>(46);
        for (int i=0;i<10;i++){
            arr.add(i+12);
        }
        System.out.println(arr);
        boolean b=arr.isEmpty();
        System.out.println(b);
        arr.remove(8);
        System.out.println(arr.contains(5));
        arr.clear();
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.indexOf(15));
    }
    public static void TwoD(){
        List<List<Integer>> arr= new ArrayList<>();
        arr.add(new ArrayList<>(3));
        arr.add(new ArrayList<>(4));
    }
    public static void main(String[] args) {

    }
}
