package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
//        3 4 1 9 56 7 9 12
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(56);
        a.add(7);
        a.add(9);
        a.add(12);
        int n= a.size();
        int m=5;

        System.out.println(findMinDiff(a,n,m));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int len= a.size();
        long diff=Long.MAX_VALUE;
        int i=0;
        for(int j=m-1;j<n;j++){
            long diff1=a.get(j)-a.get(i);
            if(diff1<diff){
                diff=diff1;
            }
            i++;
        }
        return diff;
    }
}
