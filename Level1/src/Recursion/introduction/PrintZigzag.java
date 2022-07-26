package Recursion;

import java.util.Scanner;

public class PrintZigzag {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
         zigzag(n);

    }

    public static void zigzag(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre: " + n);
        zigzag(n-1);
        System.out.println("In: " +n);
        zigzag(n-1);
        System.out.println("Post: " + n);
    }
}
