package BackTracking;

public class RatInMaze2 {
    public static int path(int row,int col,int m,int n){
        if(row>m || col>n)return 0;
        if(row==m && col==n)return 1;
        int rightPath= path(row,col+1,m,n);
        int downPath= path(row+1,col,m,n);
        return rightPath+downPath;
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int totalPath= path(1,1,m,n);
        System.out.println(totalPath);
    }
}
