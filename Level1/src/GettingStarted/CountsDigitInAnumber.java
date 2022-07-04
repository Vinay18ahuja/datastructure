package GettingStarted;

import java.util.Scanner;

public class CountsDigitInAnumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }

}
