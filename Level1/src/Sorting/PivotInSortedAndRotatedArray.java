package Sorting;

import java.util.Scanner;

public class PivotInSortedAndRotatedArray {
    public static int findPivot(int[] arr) {
        int li=0;
        int ri= arr.length-1;
        while(li<ri){
            int mid=(li+ri)/2;
            if(arr[mid]<arr[ri]){
                ri=mid;
            }else{
                li=mid+1;
            }
        }
        return arr[ri];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

}
