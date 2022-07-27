package Recursion.RecursionWithArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> res=getMazePaths(1,1,n,m);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String>mres=new ArrayList<>();
        //horizontal move
        for(int ms=1; ms <= dc-sc; ms++){
            ArrayList<String>hpath=getMazePaths(sr,sc+ms,dr,dc);
            for(String path:hpath){
                mres.add("h" +ms +path);
            }
        }
        //vertical move
        for(int ms=1; ms <= dr-sr;ms++){
            ArrayList<String>vpath=getMazePaths(sr+ms,sc,dr,dc);
            for(String path:vpath){
                mres.add("v" +ms +path);
            }
        }
        //diagonal move
        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            ArrayList<String>dpath=getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String path:dpath){
                mres.add("d" +ms +path);
            }
        }

        return mres;
    }
}
