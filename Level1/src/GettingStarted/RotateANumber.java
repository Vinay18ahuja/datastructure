package GettingStarted;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=count;i++){
            if(i<=k){
                div=div*10;
            }else{
                mul=mul*10;
            }
        }
        int q=n/div;
        int rem=n%div;
        int rot=rem*mul+q;
        System.out.println(rot);
    }
}
