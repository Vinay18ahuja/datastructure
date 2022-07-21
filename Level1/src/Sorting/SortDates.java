package Sorting;

import java.util.Scanner;

public class SortDates {
    public static void sortDates(String[] arr) {
          countSort(arr,1000000,100,32);//date
          countSort(arr,10000,100,13); //month
          countSort(arr,1,10000,2501);
    }

    public static void countSort(String[] arr,int div, int mod, int range) {
        String[] ans=new String[arr.length];
        int[] farr=new int[range];
        for(int i=0;i< arr.length;i++){
            int index=(Integer.parseInt(arr[i],10)/div)%mod;
            farr[index]++;
        }
        for (int i=1;i< farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }
        for (int i= arr.length-1;i>=0;i--){
            int val=Integer.parseInt(arr[i],10);
            int pos=farr[(val/div)%mod];
            int index=pos-1;
            ans[index]=arr[i];
            farr[(val/div)%mod]--;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }

    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }
}
