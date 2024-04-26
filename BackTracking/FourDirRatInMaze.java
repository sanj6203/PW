package BackTracking;

public class FourDirRatInMaze {
    public static void print(int sc,int sr,String str,int rows,int cols,boolean isChecked[][]){
        if(sc>cols || sr>rows)return;
        if(sc<0||sr<0) return;
        if(isChecked[sr][sc]==true)return;
        if(sc==cols && sr==rows){
            System.out.println(str);
        }
        isChecked[sr][sc]=true;
        print(sc+1,sr,str+"R",rows,cols,isChecked);
        print(sc,sr+1,str+"D",rows,cols,isChecked);
        print(sc,sr-1,str+"U",rows,cols,isChecked);
        print(sc-1,sr,str+"L",rows,cols,isChecked);
        isChecked[sr][sc]=false;
    }
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        boolean[][] isChecked= new boolean[rows][cols];
        print(0,0,"",rows-1,cols-1,isChecked);
    }
}
