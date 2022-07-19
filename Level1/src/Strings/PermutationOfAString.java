package Strings;

import java.util.Scanner;

public class PermutationOfAString {
    public static void solution(String str){
       int len=str.length();
       int f=factorial(len);
       for(int i=0;i<f;i++){
           StringBuilder sb=new StringBuilder(str);
           int temp=i;
           for(int div=len;div>0;div--){
               int q=temp/div;
               int r=temp%div;
               System.out.print(sb.charAt(r));
               sb.deleteCharAt(r);
               temp=q;
           }
           System.out.println();
       }

    }

    private static int factorial(int len) {
        int val=1;
        for(int i=2;i<=len;i++){
            val*=i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
