package DynamicProgramming;

import java.util.Scanner;

public class Fibonaccidp {
    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int fn=fibonacci(n,new int[n+1]);
       System.out.println(fn);
    }

    private static int fibonacci(int n, int[] qb) {
    if(n==0 || n==1){
        return n;
    }
    if(qb[n]!=0){
        return qb[n];
    }
    int fibnm1=fibonacci(n-1,qb);
    int fibnm2=fibonacci(n-2,qb);
    int fibn=fibnm1+fibnm2;
    qb[n]=fibn;
    return fibn;
    }
}
