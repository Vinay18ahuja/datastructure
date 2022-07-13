package GettingStarted;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r=scn.nextInt();
        int nfact=getPermutation(n);
        int nmrfact=getPermutation(n-r);
        int fact=nfact/nmrfact;
        display(fact);
    }

    private static void display(int fact) {
        System.out.println(fact);
    }

    private static int getPermutation(int n) {
        int rv=1;
        for(int i=1;i<=n;i++){
            rv*=i;
        }
        return rv;
    }
}
