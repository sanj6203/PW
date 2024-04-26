package Arrays;

class ShortestDirection
{
    static String shortestPath (String S)
    {
        int x=0,y=0;
        for(int i=0;i<S.length();i++){
            char ch= S.charAt(i);
            if(ch=='W') x++;
            else if(ch=='E') x--;
            else if(ch=='N') y++;
            else if(ch=='S') y--;
        }
        StringBuilder str= new StringBuilder();
        if(x<0){
            for(int i=x;i<0;i++) str.append("E");
        }
        if(y>0){
            for(int i=1;i<=y;i++) str.append("N");
        }
        if(y<0){
            for(int i=y;i<0;i++) str.append("S");
        }
        if(x>0){
            for(int i=1;i<=x;i++) str.append("W");
        }

        String newStr= str.toString();
        return newStr;
    }

    public static void main(String[] args) {
        String S = "SSSNEEEW";
        String str= shortestPath(S);
        System.out.println(str);

    }
}
