package Arrays;

public class MedianOfTwoSortedArray {
    public static double printMedian(int[] a,int[] b, int len1, int len2){
        int i=0,j=0,k=0;
        int[] newArr= new int[len1+len2];
        while(i<len1 && j<len2){
            if(a[i]>b[j]) newArr[k++]=b[j++] ;
            else newArr[k++]=a[i++];
        }
        while (i < len1) {
            newArr[k++] = a[i++];
        }
        while (j < len2) {
            newArr[k++] = b[j++];
        }
        int l= newArr.length;
        double median;
        if(l%2==0){
            int mid= l/2;
            median=(newArr[mid]+newArr[mid-1])/2.0;
        }else {
            int mid= l/2;
            median=newArr[mid];
        }
        return median;

    }
    public static void main(String[] args) {
        int[] a={4,6};
        int[] b={1,2,3,5};
        System.out.println(printMedian(a,b,a.length,b.length));
    }
}
