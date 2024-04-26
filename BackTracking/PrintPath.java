package BackTracking;

public class PrintPath {
    public static void printpath(int sc,int sr,String str,int rows,int cols){
        if(sc>cols || sr>rows)return;
        if(sc==cols && sr==rows){
            System.out.println(str);
        }
        printpath(sc+1,sr,str+"R",rows,cols);
        printpath(sc,sr+1,str+"D",rows,cols);
    }
    public static void main(String args[]){
        int rows= 3;
        int cols=3;
        printpath(1,1,"",rows,cols);
    }
}
