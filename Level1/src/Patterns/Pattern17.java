package Patterns;

import java.util.Scanner;

/*

  *
  **
*****
  **
  *

*/

public class Pattern17 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st=1;
        int sp=2;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=sp;j++){
               if(i==(n/2)+1){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
           }
           for(int j=1;j<=st;j++){
               System.out.print("*");
           }
           if(i<=n/2) {
               st++;
           }else{
               st--;
           }
           System.out.println("");
       }
    }

}
