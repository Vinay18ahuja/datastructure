package OneDArrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data=scn.nextInt();
        int ceil=0;
        int floor=0;
        int li=0;
        int ri=arr.length-1;
        while(li<=ri){
        int mid=(li+ri)/2;
        if(data>arr[mid]){
            li=mid+1;
            floor=arr[mid];
        }else if (data<arr[mid]){
            ri=mid-1;
            ceil=arr[mid];
        }else{
            ceil=arr[mid];
            floor=arr[mid];
            break;
        }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
