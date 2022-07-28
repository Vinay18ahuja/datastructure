package Recursion.RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintKpc {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
    }
    static String[] codes={";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        String charCodes=codes[ch-'0'];
        for(int i=0;i<charCodes.length();i++){
            char cho=charCodes.charAt(i);
            printKPC(roq,asf+cho);
        }
    }
}
