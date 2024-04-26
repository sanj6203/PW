package Arrays;

public class DailyTemperature {
    public static String add(String n1,String n2){
        return n1+n2;
    }
    public static int[] max(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]+=i;
        }
        return arr;
    }
    public static void main(String[] args) {
//        String n1="3";
//        String n2="6";
//        String afterAdding=add(n1,n2);
//        System.out.println(afterAdding);
        int[] newArr= {5,6,7,8,9};
        int[] newarray= max(newArr);
        for (int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
    }
}
