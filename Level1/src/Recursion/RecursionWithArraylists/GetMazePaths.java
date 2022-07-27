package Recursion.RecursionWithArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String>res=getMazePaths(1,1,n,m);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String>hpath=new ArrayList<>();
        ArrayList<String>vpath=new ArrayList<>();
        if(sc<dc){
            hpath=getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpath=getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String>mres=new ArrayList<>();
        for(String path:hpath){
            mres.add("h"+path);
        }
        for(String path:vpath){
            mres.add("v"+path);
        }
        return mres;
    }
}
