package OneDArrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k= scn.nextInt();
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0, arr.length-1);
        printArray(arr);
    }

    private static void reverse(int[] arr, int i, int j) {
        int li=i;
        int ri=j;
        while(li<ri){
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }

    }

    private static void printArray(int[] arr) {
        for(int val:arr){
            System.out.println(val);
        }
    }
}
