package Recursion.RecursionWithArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String>res=getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String>path1=getStairPaths(n-1);
        ArrayList<String>path2=getStairPaths(n-2);
        ArrayList<String>path3=getStairPaths(n-3);
        ArrayList<String>mres=new ArrayList<>();
        for(String path:path1){
            mres.add("1" + path);
        }
        for(String path:path2){
            mres.add("2" + path);
        }
        for(String path:path3){
            mres.add("3" + path);
        }
        return mres;
    }
}
