package OneDArrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data=scn.nextInt();
        int li=0;
        int ri=arr.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(data>arr[mid]){
                li=mid+1;
            }else if(data<arr[mid]){
                ri=mid-1;
            }else{
                System.out.println(mid);
               return;
            }

        }
        System.out.println(-1);

    }
}
