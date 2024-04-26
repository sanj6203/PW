package Arrays;

import java.util.Scanner;

public class Prints {
    public static void print(int n){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "";
        while (true){
            while (str==""){
                for (int i=0;i<=9;i++){
                    String str1= sc.nextLine();
                    if(str==""){
                        System.out.println(i);
                        if(i==9)break;
                    }
                    else {
                        break;
                    }
                }
                str="s";
            }

            str= sc.nextLine();
            if(str!="") break;

        }


    }
}
