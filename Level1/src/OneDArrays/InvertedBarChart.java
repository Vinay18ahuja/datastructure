package OneDArrays;

import java.util.Scanner;

/*
Input
53


Output
*	*		*	*
*			*	*
*			*	*
			*	*
			*	*
			*
			*


*/

public class InvertedBarChart {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int limit=0;limit<max;limit++){
         for(int i=0;i<arr.length;i++){
             if(arr[i]>limit){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         System.out.println();
        }
    }
}
