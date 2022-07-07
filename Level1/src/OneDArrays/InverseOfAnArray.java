package OneDArrays;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
      int[] inv=   inverse(arr);
        printArray(inv);
    }

    private static int[] inverse(int[] arr) {
        int[] inv=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            inv[v]=i;
        }
        return inv;
    }
    private static void printArray(int[] arr) {
        for(int val:arr){
            System.out.println(val);
        }
    }
}
