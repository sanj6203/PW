package strings;

public class LinearSearch {
    public static void main(String[] args) {
        String arr[]={"sanjeet","bikash","priyanshu","arif","shivam"};
        String key="arif";
        for(int i=0;i<arr.length;i++){
            String temp= arr[i];
            if(temp.compareTo(key)==0){
                System.out.println(i);
                break;
            }
        }
    }
}
