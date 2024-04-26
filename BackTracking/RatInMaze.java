package BackTracking;

public class RatInMaze {
    public static void main(String args[]){
        int rows= 3;
        int cols=3;
        int total= ratInMaze(1,1,rows,cols);
        System.out.println(total);

    }

    private static int ratInMaze(int sc, int sr, int rows, int cols) {
        if(sc>cols||sr>rows)return 0 ;
        if(sc==cols && sr==rows)return 1;
        int downWays= ratInMaze(sc+1,sr,rows,cols);
        int rightWays= ratInMaze(sc,sr+1,rows,cols);
        int totalPath = downWays + rightWays;
        return totalPath;
    }
}
