package Recursion.RecursionWithArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String>res=getKPC(str);
        System.out.println(res);
    }
    static String[] codes={";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=getKPC(ros);
        ArrayList<String>mres=new ArrayList<>();
        String charCodes=codes[ch-'0'];
        for(int i=0;i<charCodes.length();i++){
           char chcode=charCodes.charAt(i);
           for(String mstr:rres){
               mres.add(chcode + mstr);
           }
        }
        return mres;
    }

}
