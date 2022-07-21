package Sorting;

import java.util.Scanner;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int exp=1;
        while(exp<=max){
            countSort(arr,exp);
            exp*=10;
        }
    }

    public static void countSort(int[] arr, int exp) {
       int[] ans=new int[arr.length];
       int[] farr=new int[10];
       for(int i=0;i<arr.length;i++){
           int index=(arr[i]/exp)%10;
           farr[index]++;
       }
       for (int i=1;i< farr.length;i++){
           farr[i]=farr[i]+farr[i-1];
        }
       for (int i=0;i<arr.length;i++){
           int val=arr[i];
           int pos=farr[(val/exp)%10];
           int index=pos-1;
           ans[index]=val;
           farr[(val/exp)%10]--;
       }
       for(int i=0;i< arr.length;i++){
           arr[i]=ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
