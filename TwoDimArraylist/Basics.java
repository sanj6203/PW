package TwoDimArraylist;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String args[]){
        List<Integer> a= new ArrayList<>();
        a.add(45);a.add(50);a.add(55);
        List<Integer> b= new ArrayList<>();
        b.add(33);b.add(76);b.add(89);
        List<Integer> c= new ArrayList<>();
        List<Integer> d= new ArrayList<>();
        d.add(99);d.add(90);
        List<List<Integer>> l= new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);
        for (int i=0;i<l.size();i++){
            for (int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");
            }
        }
        System.out.println(l.get(1).contains(33));
        System.out.println(l.get(1).indexOf(89));
//        int[] arr = a.toArray();
//        System.out.println(arr);
        int arr[]= {45,33,78,90,23};

    }
}
