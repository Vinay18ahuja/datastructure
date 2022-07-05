package Patterns;

/*

x*1=x
x*2=2x
x*3=3x
x*4=4x
x*5=5x
x*6=6x
x*7=7x
x*8=8X
x*9=9x
x*10=10x

*/

import java.util.Scanner;

public class Pattern14 {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int i=1;i<=10;i++){
        int val=n*i;
        System.out.println(n + " * " + i + " = " + val);
    }

    }
}
