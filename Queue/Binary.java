package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    public static void binary2(int n){
        for (int i=1;i<=n;i++){
            String str= Integer.toBinaryString(i);
            System.out.println(str);
        }
    }
    public static void binary(int n){
        int count=1;
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        while(count<=n){
            q.add((q.peek()*10)+0);
            q.add((q.peek()*10)+1);
            System.out.println(q.poll());
            count++;
        }
        q.clear();


    }
    public static void main(String[] args) {
//        binary(14);
        binary2(14);
    }
}
