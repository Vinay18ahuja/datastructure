package TwoDArrays;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            int svj=0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k< arr.length;k++){
                if(arr[i][svj]<arr[k][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }

        }
        System.out.println("Invalid Input");
    }
}
